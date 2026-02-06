package assignments.assignment3.composite;

public class Main {
    public static void main(String[] args) {
        Organization org1 = new Department("Root1");
        Organization org2 = new Department("Root2");
        Organization org3 = new Department("Root3");

        Organization emp1 = new Employee("Jack", 3000);
        Organization emp2 = new Employee("Jill", 3500);
        Organization emp3 = new Employee("Joe", 2800);

        org1.add(emp1);
        org1.add(emp2);
        org2.add(emp3);

        org1.add(org2);
        org1.add(org3);

        org1.remove(org3);

        org1.printData();
        emp2.printData();
        org1.getTotalSalary();

        org1.toXml(0);

        org1.getTotalSalary();
    }
}
