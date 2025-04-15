package Visitor;

interface FileSystemElement {
    String getName();
    void accept(FileSystemVisitor visitor);
}
