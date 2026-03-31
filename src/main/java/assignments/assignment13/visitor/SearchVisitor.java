package assignments.assignment13.visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String searchTerm;
    private List<File> foundFiles = new ArrayList<>();

    public SearchVisitor(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchTerm)) {
            foundFiles.add(file);
            System.out.println("Found file: " + file.getName() + " (size: " + file.getSize() + " bytes)");
        }
    }

    @Override
    public void visit(Directory directory) {
        // No specific action needed for directories in this visitor
    }
}
