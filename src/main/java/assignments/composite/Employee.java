package assignments.composite;

public class Employee extends Organization {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void printData() {
        System.out.println("Employee: " + name + ", salary: " + salary);
    }

    public void add(Organization organization) {
        throw new UnsupportedOperationException("Is not supported");
    }

    public void remove(Organization organization) {
        throw new UnsupportedOperationException("Is not supported");
    }

    public double getTotalSalary() {
        System.out.println("Employee: " + name + ", salary: " + salary);
        return salary;
    }

    public String toXml(int indent) {
        String indentation = getIndent(indent);
        return indentation + "<Employee name=\"" + name + "\" salary=\"" + salary + "\"/>\n";
    }
}
