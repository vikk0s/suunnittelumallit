package assignments.assignment10.chain_of_responsibility;

public class ContactRequestHandler implements FeedbackHandler {
    private FeedbackHandler nextHandler;

    public void setNextHandler(FeedbackHandler handler) {
        this.nextHandler = handler;
    }

    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Contact request received: " + message.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleFeedback(message);
        }
    }
}
