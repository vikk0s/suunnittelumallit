package assignments.assignment12.proxy;

public class RealDocument implements Document {
    private String id;
    private String creationDate;
    private String content;
    private boolean isProtected;

    public RealDocument(String id, String creationDate, String content, boolean isProtected) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
        this.isProtected = isProtected;
    }

    @Override
    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    public String getDocumentId() {
        return id;
    }

    public boolean isProtected() {
        return isProtected;
    }
}
