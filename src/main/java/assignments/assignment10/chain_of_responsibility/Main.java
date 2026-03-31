package assignments.assignment10.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        FeedbackHandler compensationClaimHandler = new CompensationClaimHandler();
        FeedbackHandler contactRequestHandler = new ContactRequestHandler();
        FeedbackHandler developmentRequestHandler = new DevelopmentRequestHandler();
        FeedbackHandler generalFeedbackHandler = new GeneralFeedbackHandler();

        compensationClaimHandler.setNextHandler(contactRequestHandler);
        contactRequestHandler.setNextHandler(developmentRequestHandler);
        developmentRequestHandler.setNextHandler(generalFeedbackHandler);

        Message compensationClaimMessage = new Message(MessageType.COMPENSATION_CLAIM, "Request for compensation due to damaged product", "customer1@example.com");
        Message contactRequestMessage = new Message(MessageType.CONTACT_REQUEST, "I need help with my order", "customer2@example.com");
        Message developmentRequestMessage = new Message(MessageType.DEVELOPMENT_REQUEST, "Feature request: Dark mode for the website", "customer3@example.com");
        Message generalFeedbackMessage = new Message(MessageType.GENERAL_FEEDBACK, "Great service, but could use faster shipping", "customer4@example.com");

        compensationClaimHandler.handleFeedback(compensationClaimMessage);
        compensationClaimHandler.handleFeedback(contactRequestMessage);
        compensationClaimHandler.handleFeedback(developmentRequestMessage);
        compensationClaimHandler.handleFeedback(generalFeedbackMessage);
    }
}
