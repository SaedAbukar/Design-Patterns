package ChainOfResponsibilty;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Handler compensationHandler = new CompensationHandler();
        Handler contactHandler = new ContactHandler();
        Handler suggestionHandler = new DevelopmentHandler();
        Handler feedbackHandler = new GeneralHandler();

        compensationHandler.setNext(contactHandler);
        contactHandler.setNext(suggestionHandler);
        suggestionHandler.setNext(feedbackHandler);

        List<Message> messages = Arrays.asList(
                new Message(MessageTypes.COMPENSATION, "My order arrived damaged. I request a refund.", "lebron"),
                new Message(MessageTypes.CONTACT, "I want to discuss partnership opportunities.", "steph"),
                new Message(MessageTypes.DEVELOPMENT, "Please add dark mode to the app.", "neymar"),
                new Message(MessageTypes.GENERAL, "Love your service! Keep it up.", "saed")
        );

        for (Message message : messages) {
            compensationHandler.handle(message);
        }
    }
}
