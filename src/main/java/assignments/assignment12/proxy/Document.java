package assignments.assignment12.proxy;

public interface Document {
    String getCreationDate();
    String getContent(User user) throws AccessDeniedException;
}
