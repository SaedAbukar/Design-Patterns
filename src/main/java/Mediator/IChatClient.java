package Mediator;

public interface IChatClient {
    String getName();
    void receiveMessage(String from, String message);
    void refreshRecipients(String[] clientNames);
}
