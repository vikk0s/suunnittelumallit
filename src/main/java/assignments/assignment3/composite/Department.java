package assignments.assignment3.composite;

import java.util.List;
import java.util.ArrayList;

public class Department extends Organization {
    private List<Organization> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void printData() {
        System.out.println(this.name);
        for (Organization child : this.children) {
            child.printData();
        }
    }

    public void add(Organization organization) {
        this.children.add(organization);
    }

    public void remove(Organization organization) {
        this.children.remove(organization);
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Organization child : this.children) {
            totalSalary += child.getTotalSalary();
        }
        System.out.println(this.name + " total salary: " + totalSalary);
        return totalSalary;
    }

    public String toXml(int indent) {
        StringBuilder xml = new StringBuilder();
        String indentation = getIndent(indent);

        xml.append(indentation).append("<department name=\"").append(this.name).append("\">\n");
        for (Organization child : this.children) {
            xml.append(child.toXml(indent + 1));
        }
        xml.append(indentation).append("</department>\n");

        System.out.println(xml.toString());
        return xml.toString();
    }
}
