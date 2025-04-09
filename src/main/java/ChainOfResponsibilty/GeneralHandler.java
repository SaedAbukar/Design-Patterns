package ChainOfResponsibilty;

public class GeneralHandler extends Handler {

    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageTypes.GENERAL;
    }

    @Override
    protected void processMessage(Message message) {
        System.out.println("Processing general feedback from " + message.getSender());
        System.out.println("Analyzing feedback: " + message.getMessage() + "\n");
    }
}
