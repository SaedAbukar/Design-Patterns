package ChainOfResponsibilty;

public abstract class Handler {
    protected Handler nextHandler;
    public void setNext(Handler next) {
        this.nextHandler = next;
    };

    public void handle(Message message){
        if (canHandle(message)) {
            processMessage(message);
        } else if (nextHandler != null) {
            nextHandler.handle(message);
        } else {
            System.out.println("No handler found for message: " + message.getMessage());
        }
    };

    protected abstract boolean canHandle(Message message);
    protected abstract void processMessage(Message message);
}
