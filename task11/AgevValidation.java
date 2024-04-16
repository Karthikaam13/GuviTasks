package task11;

import java.util.Scanner;

public class AgevValidation {
    public static void main(String[] args) {
        try {
            int age = getAgeFromUser(); // Assume this method gets the age from the user
            validateAge(age); // Validate the age
            System.out.println("Valid age entered: " + age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage()); // Display error message
        }
    }

    // Method to get age from the user
    public static int getAgeFromUser() {
        
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        return age;

        
    }

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or more than 18 years.");
        }
    }
    
}
