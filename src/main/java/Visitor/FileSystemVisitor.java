package Visitor;
interface FileSystemVisitor {

    void visit(File visitor);
    void visit(Directory visitor);
}
