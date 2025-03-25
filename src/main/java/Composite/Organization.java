package Composite;

import java.util.ArrayList;

public class Organization extends Container {
    private String name;
    private ArrayList<Component> members;
    public Organization(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }
    @Override
    public double getSalary() {
        double salary = 0;
        for (Component member : members) {
            salary += member.getSalary();
        }
        return salary;
    }

    @Override
    public void add(Component member) {
        members.add(member);
    }

    @Override
    public void remove(Component member) {
        members.remove(member);
    }

    @Override
    public String toXML(int indentLevel) {
        String indent = "    ".repeat(indentLevel);
        StringBuilder xml = new StringBuilder();

        xml.append(String.format("%s</organization> name=\"%s\" total_salary=\"%.2f\"/>\n", indent, name, this.getSalary()));

        for (Component member : members) {
            xml.append(member.toXML(indentLevel + 1)); // Recursively add members
        }

        xml.append(String.format("%s<organization>\n", indent));
        return xml.toString();
    }
}
