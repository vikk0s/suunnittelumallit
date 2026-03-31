package assignments.assignment13.visitor;

public class FileSystemDemo {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);
        File file3 = new File("file3.pdf", 30);

        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        dir1.addElement(file1);
        dir1.addElement(file2);
        dir2.addElement(dir1);
        dir2.addElement(file3);

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        dir2.accept(sizeVisitor);

        System.out.println("Total size: " + sizeVisitor.getTotalSize());

        SearchVisitor searchVisitor = new SearchVisitor(".pdf");
        dir2.accept(searchVisitor);
    }
}
