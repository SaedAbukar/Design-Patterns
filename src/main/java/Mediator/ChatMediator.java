package Mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatMediator implements IChatMediator {
    private Map<String, IChatClient> clients;
    public ChatMediator() {
        clients = new HashMap<>();
    }

    @Override
    public void sendMessage(String from, String to, String message) {
        IChatClient recipient = clients.get(to);
        if (recipient != null) {
            recipient.receiveMessage(from, message);
        }
    }

    @Override
    public void broadcast(String from, String message) {
        for (Map.Entry<String, IChatClient> entry : clients.entrySet()) {
            if (!entry.getKey().equals(from)) {
                entry.getValue().receiveMessage(from, message);
            }
        }
    }
    @Override
    public void registerClient(IChatClient client) {
        clients.put(client.getName(), client);
        for (IChatClient c : clients.values()) {
            if (c != client) {
                c.refreshRecipients(clients.keySet().toArray(new String[0]));
            }
        }
    }

    @Override
    public String[] getClientNames() {
        return clients.keySet().toArray(new String[0]);
    }
}
