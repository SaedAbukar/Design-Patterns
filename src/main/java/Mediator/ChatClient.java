package Mediator;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatClient implements IChatClient {
    private String name;
    private ChatMediator mediator;

    private TextArea chatArea = new TextArea();
    private ComboBox<String> recipientCombo = new ComboBox<>();
    private TextField messageField = new TextField();
    private Button sendButton = new Button("Send");

    public ChatClient(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerClient(this);

        Stage stage = new Stage();
        stage.setTitle("Chat - " + name);

        chatArea.setEditable(false);
        messageField.setPromptText("Enter your message");

        // Add "All" and other clients to the recipientCombo
        recipientCombo.getItems().add("All");
        recipientCombo.getItems().addAll(mediator.getClientNames());
        recipientCombo.getItems().remove(name);
        recipientCombo.getSelectionModel().selectFirst();

        VBox layout = new VBox(10, chatArea, recipientCombo, messageField, sendButton);
        stage.setScene(new Scene(layout, 400, 300));
        stage.show();

        // Send message action
        sendButton.setOnAction(e -> {
            String message = messageField.getText().trim();
            String recipient = recipientCombo.getValue();
            if (!message.isEmpty()) {
                if ("All".equals(recipient)) {
                    mediator.broadcast(name, message);
                    chatArea.appendText("You to All: " + message + "\n");
                } else {
                    mediator.sendMessage(name, recipient, message);
                    chatArea.appendText("You to " + recipient + ": " + message + "\n");
                }
                messageField.clear();
            }
        });
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void receiveMessage(String from, String message) {
        chatArea.appendText(from + " to You: " + message + "\n");
    }

    @Override
    public void refreshRecipients(String[] clientNames) {
        recipientCombo.getItems().clear();
        recipientCombo.getItems().add("All");
        for (String clientName : clientNames) {
            if (!clientName.equals(name)) {
                recipientCombo.getItems().add(clientName);
            }
        }
        recipientCombo.getSelectionModel().selectFirst();
    }
}
