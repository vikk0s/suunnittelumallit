package assignments.assignment13.visitor;

public interface FileSystemElement {
    double getSize();
    void accept(FileSystemVisitor visitor);
}
