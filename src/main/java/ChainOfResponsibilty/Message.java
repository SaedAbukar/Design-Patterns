package ChainOfResponsibilty;

public class Message {
    private MessageTypes type;
    private String message;
    private String sender;

    public Message(){};

    public Message(MessageTypes type, String message, String sender) {
        this.type = type;
        this.message = message;
        this.sender = sender;
    }

    public MessageTypes getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }


}
