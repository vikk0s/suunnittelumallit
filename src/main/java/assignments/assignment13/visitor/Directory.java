package assignments.assignment13.visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> elements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    public void removeElement(FileSystemElement element) {
        elements.remove(element);
    }

    public double getSize() {
        double totalSize = 0;
        for (FileSystemElement element : elements) {
            totalSize += element.getSize();
        }
        return totalSize;
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (FileSystemElement element : elements) {
            element.accept(visitor);
        }
    }
}
