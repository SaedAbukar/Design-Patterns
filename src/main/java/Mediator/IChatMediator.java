package Mediator;

interface IChatMediator {
    void sendMessage(String from, String to, String message);
    void broadcast(String from, String message);
    void registerClient(IChatClient client);
    String[] getClientNames();
}
