package Composite;

public class Employee implements Component {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toXML(int indentLevel) {
        String indent = "    ".repeat(indentLevel); // Indentation for readability
        return String.format("%s<employee name=\"%s\" salary=\"%.2f\"/>\n", indent, name, salary);
    }
}
