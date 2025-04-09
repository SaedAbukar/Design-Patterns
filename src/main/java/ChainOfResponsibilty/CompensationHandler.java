package ChainOfResponsibilty;

public class CompensationHandler extends Handler {

    @Override
    protected boolean canHandle(Message message) {
        return message.getType() == MessageTypes.COMPENSATION;
    }

    @Override
    protected void processMessage(Message message) {
        System.out.println("Processing compensation claim from " + message.getSender());
        System.out.println("Reviewing claim: " + message.getMessage());
        System.out.println("Decision: Claim under review. Customer will be contacted soon.\n");
    }
}
