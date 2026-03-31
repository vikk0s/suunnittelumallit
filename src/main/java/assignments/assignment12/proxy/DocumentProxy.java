package assignments.assignment12.proxy;

public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String documentId;

    public DocumentProxy(RealDocument document) {
        this.realDocument = document;
        this.documentId = document.getDocumentId();
    }

    @Override
    public String getCreationDate() {
        return realDocument.getCreationDate();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (AccessControlService.getInstance().isAllowed(documentId, user.getUsername())) {
            return realDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user " + user.getUsername() + " to document " + documentId);
        }
    }
}
