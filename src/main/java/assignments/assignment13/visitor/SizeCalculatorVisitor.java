package assignments.assignment13.visitor;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private double totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
        System.out.println("File: " + file.getName() + ", Size: " + file.getSize() + " bytes");
    }

    @Override
    public void visit(Directory directory) {
        System.out.println("Directory: " + directory.getName() + " elements");
    }

    public double getTotalSize() {
        double totalSize = this.totalSize;
        this.totalSize = 0;
        return totalSize;
    }
}
