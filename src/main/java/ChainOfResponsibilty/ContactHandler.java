package ChainOfResponsibilty;

public class ContactHandler extends Handler {
    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageTypes.CONTACT;
    }

    @Override
    protected void processMessage(Message message) {
        System.out.println("Processing contact request from " + message.getSender());
        System.out.println("Forwarding request: '" + message.getMessage() + "' to customer support department.\n");
    }
}
