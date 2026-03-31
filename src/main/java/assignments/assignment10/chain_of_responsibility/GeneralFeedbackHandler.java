package assignments.assignment10.chain_of_responsibility;

public class GeneralFeedbackHandler implements FeedbackHandler {
    private FeedbackHandler nextHandler;

    public void setNextHandler(FeedbackHandler handler) {
        this.nextHandler = handler;
    }

    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("General feedback: " + message.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleFeedback(message);
        }
    }
}
