package Composite;
public class Main {
    public static void main(String[] args) {
        Department engineering = new Department("Engineering");
        engineering.add(new Employee("Alice", 70000));
        engineering.add(new Employee("Bob", 60000));

        Department software = new Department("Software");
        software.add(new Employee("Charlie", 80000));
        engineering.add(software);

        Department hr = new Department("HR");
        hr.add(new Employee("David", 50000));

        Organization organization = new Organization("Saed LLC.");
        organization.add(engineering);
        organization.add(hr);

        // Print XML structure
        System.out.print(organization.toXML(0));
        organization.remove(hr);
        System.out.println("");
        System.out.print(organization.toXML(0));
    }
}
