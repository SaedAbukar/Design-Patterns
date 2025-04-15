package Visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor{

    List<FileSystemElement> elements;
    String fileEnc;

    public SearchVisitor(String fileEnc) {
        this.elements = new ArrayList<FileSystemElement>();
        this.fileEnc = fileEnc;
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    @Override
    public void visit(File visitor) {
        if (visitor.getName().endsWith(fileEnc)) {
            elements.add(visitor);
        }
    }

    @Override
    public void visit(Directory visitor) {
        List<FileSystemElement> e = visitor.getElements();
        for (FileSystemElement element : e){
            element.accept(this);
        }
    }
}
