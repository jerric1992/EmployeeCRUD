package entity;

public class Employee extends AbstractPerson {

    private static int employeeID = 10000;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        employeeID++;
    }

    public static int getEmployeeID() {
        return employeeID;
    }
}
