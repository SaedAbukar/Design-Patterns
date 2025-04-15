package Visitor;

import java.util.List;

public class SizeCalculatorVisitor implements FileSystemVisitor{

    Double size;

    public SizeCalculatorVisitor(){
        this.size = 0.0;
    }

    @Override
    public void visit(File visitor) {
        this.size += visitor.getSize();
    }

    @Override
    public void visit(Directory visitor) {
        this.size = 0.0;
        List<FileSystemElement> elements = visitor.getElements();
        for (FileSystemElement element : elements) {
            element.accept(this);
        }
    }
}
