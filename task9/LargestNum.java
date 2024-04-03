package task9;

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers from the user
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
       
        
        
        double largest = num1;

        // Check if the second number is larger than the current largest
        if (num2 > largest) {
            largest = num2;
        }

        // Check if the third number is larger than the current largest
        if (num3 > largest) {
            largest = num3;
        }

        // Print the largest number
        System.out.println("The largest number is: " + largest);
    }
    
}
