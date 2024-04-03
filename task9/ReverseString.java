package task9;

import java.util.Scanner;

public class ReverseString 

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Loop through the characters of the input string in reverse order
        for (int i = inputString.length() - 1; i >= 0; i--) {
            // Append each character to the reversedString
            reversedString += inputString.charAt(i);
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);
    }
}


    
