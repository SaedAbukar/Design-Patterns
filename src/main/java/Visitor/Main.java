package Visitor;

public class Main {
    public static void main(String[] args) {
        SizeCalculatorVisitor visitor = new SizeCalculatorVisitor();
        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        Directory directory = new Directory("Dir1");
        Directory directory2 = new Directory("Dir2");
        File file1 = new File("Test.txt", 2.0);
        File file2 = new File("Test.txt", 3.0);
        File file3 = new File("Test.jpg", 4.0);
        File file4 = new File("Test.jpg", 5.0);
        File file5 = new File("Test.jpg", 6.0);
        File file6 = new File("Test.jpg", 7.0);
        File file7 = new File("Test.txt", 8.0);

        directory.addElement(file1);
        directory.addElement(file2);
        directory.addElement(file3);
        directory.addElement(file5);
        directory.addElement(file6);
        directory.addElement(file7);

        directory.accept(visitor);
        directory.accept(searchVisitor);
        file4.accept(visitor);
        file4.accept(searchVisitor);

        System.out.println("Total size: " + visitor.size + " MB");

        System.out.println("Matched .txt files:");
        for (FileSystemElement e: searchVisitor.getElements()) {
            System.out.println(e);
        }
    }
}
