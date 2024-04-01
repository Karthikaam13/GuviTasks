package task8;

import java.util.Scanner;

public class SwapNums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the first number: ");
        int first_Number = scanner.nextInt();

        
        System.out.print("Enter the second number: ");
        int second_Number = scanner.nextInt();

       
        int temp = first_Number;
        first_Number = second_Number;
        second_Number = temp;

        // Print the swapped values
        System.out.println("Swapped values:");
        System.out.println("First number: " + first_Number);
        System.out.println("Second number: " + second_Number);

       
}
    
}
