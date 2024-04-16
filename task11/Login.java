package task11;
import java.util.Scanner;

public class Login {
    private static final String CORRECT_PASSWORD = "Guvi@123"; // Define the correct password

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Login System!");

        // Prompt the user to enter the password
        System.out.print("Enter your password: ");
        String passwordAttempt = scanner.nextLine();

        try {
            login(passwordAttempt); // Attempt login
            System.out.println("Login successful!");
        } catch (IncorrectPasswordException e) {
            System.out.println("Error: Incorrect password. Please try again.");
        }

        scanner.close();
    }

    // Method to perform login
    public static void login(String password) throws IncorrectPasswordException {
        // Check if the password matches the correct password
        if (!password.equals(CORRECT_PASSWORD)) {
            throw new IncorrectPasswordException(); 
        }
    }
    
}
