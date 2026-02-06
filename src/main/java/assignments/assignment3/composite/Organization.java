package assignments.assignment3.composite;

public abstract class Organization {
    protected String name;

    public Organization(String name) {
        this.name = name;
    }

    public abstract void printData();

    public abstract void remove(Organization organization);

    public abstract void add(Organization organization);

    public abstract double getTotalSalary();

    public abstract String toXml(int indent);

    protected String getIndent(int indent) {
        return " ".repeat(indent * 2);
    }
}
