package assignments.assignment10.chain_of_responsibility;

public interface FeedbackHandler {
    void setNextHandler(FeedbackHandler nextHandler);
    void handleFeedback(Message message);
}
