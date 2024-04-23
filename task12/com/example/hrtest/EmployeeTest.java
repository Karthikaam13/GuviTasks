package com.example.hrtest;
import com.example.hr.Employee;


public class EmployeeTest {

    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee employee = new Employee("Guvi", 1001, 40000.0);

        // Printing employee's name and salary
        employee.printName();
        employee.printSalary();
    }
    
    
}
