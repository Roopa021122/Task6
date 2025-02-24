package Task6;

class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary += (salary * percent) / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + "]";
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(1011, "Roopa", "sounthari", 5000);

        // Displaying employee details
        System.out.println(emp);

        // Getting and displaying individual attributes
        System.out.println("ID: " + emp.getID());
        System.out.println("Name: " + emp.getName());
        System.out.println("Monthly Salary: " + emp.getSalary());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());

        // Raising salary by 12%
        emp.raiseSalary(12);
        System.out.println("Updated Salary after 12% raise: " + emp.getSalary());

        // Updating salary manually
        emp.setSalary(7000);
        System.out.println("Updated Salary after set: " + emp.getSalary());

        // Printing final Employee details
        System.out.println(emp);
    }
}
