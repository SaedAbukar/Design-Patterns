package ChainOfResponsibilty;

public class DevelopmentHandler extends Handler {

    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageTypes.DEVELOPMENT;
    }

    @Override
    protected void processMessage(Message message) {
        System.out.println("Processing development suggestion from " + message.getSender());
        System.out.println("Logging suggestion: " + message.getMessage() + "\n");
    }
}
