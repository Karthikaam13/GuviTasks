package task10;

public class Employee {
    // Data members
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
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

    // Setter method
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to get annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Method to raise salary by a percentage
    public void raiseSalary(int percent) {
        double raisePercentage = (double) percent / 100;
        int raiseAmount = (int) (salary * raisePercentage);
        salary += raiseAmount;
    }

    // toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(1, "John", "Doe", 50000);

        System.out.println("Original Employee Details:");
        System.out.println(employee);
        // Raise salary by 10%
        employee.raiseSalary(10);
        System.out.println("\nEmployee Details After Raise:");
        System.out.println(employee);
    }
}
