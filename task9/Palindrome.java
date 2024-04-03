package task9;

import java.util.Scanner;

public class Palindrome
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        

       

        boolean isPalindrome = true;

       
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Checking if the string is a palindrome
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
 
    



    

