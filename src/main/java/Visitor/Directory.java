package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{

    String name;
    List<FileSystemElement> elements;

    public Directory(String name) {
        this.name = name;
        this.elements = new ArrayList<FileSystemElement>();
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Directory: " + name + " with " + elements.size() + " elements";
    }

}
