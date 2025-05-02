package Mediator;

import javafx.application.Application;
import javafx.stage.Stage;

public class ChatApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        ChatMediator mediator = new ChatMediator();
        new ChatClient("Ronaldo", mediator);
        new ChatClient("Messi", mediator);
        new ChatClient("Neymar", mediator);
    }
}
