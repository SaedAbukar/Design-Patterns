package Visitor;

public class File implements FileSystemElement{

    private String name;
    private Double size;

    public File(String name, Double size) {
        this.name = name;
        this.size = size;
    }

    public Double getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "File name: " + name + " size: " + size;
    }
}
