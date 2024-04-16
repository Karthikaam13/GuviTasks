package task11;
import java.util.Scanner;

public class DivideByZero {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int numerator = scanner.nextInt();

        System.out.println("Enter the second number:");
        int denominator = scanner.nextInt();

        try {
            int result = (numerator/denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Error: Cannot divide by zero. Please enter a non-zero number for the denominator.");
           
        }
    
}
}
