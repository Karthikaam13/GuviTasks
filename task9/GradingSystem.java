package task9;

import java.util.Scanner;

public class GradingSystem {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the marks from the user
        System.out.print("Enter the marks scored by the student: ");
        float marks = scanner.nextFloat();
        
        
        // Check if the marks are valid
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Input");
        } else {
            
            char grade;
            if (marks >= 90 && marks <= 100) {
                grade = 'A';
            } else if (marks >= 80 && marks <= 89) {
                grade = 'B';
            } else if (marks >= 70 && marks <= 79) {
                grade = 'C';
            } else if (marks >= 60 && marks <= 69) {
                grade = 'D';
            } else if (marks >= 50 && marks <= 59) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            
            // Print the grade
            System.out.println("Grade: " + grade);
        }
    }
    
}
