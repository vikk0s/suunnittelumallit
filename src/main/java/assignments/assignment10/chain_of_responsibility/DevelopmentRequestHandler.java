package assignments.assignment10.chain_of_responsibility;

public class DevelopmentRequestHandler implements FeedbackHandler {
    private FeedbackHandler nextHandler;

    public void setNextHandler(FeedbackHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.DEVELOPMENT_REQUEST) {
            System.out.println("Development request handled: " + message.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleFeedback(message);
        }
    }
}
