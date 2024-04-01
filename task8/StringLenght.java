package task8;

import java.util.Scanner;

public class StringLenght {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = inputString.length();

        System.out.println("Length of the string \"" + inputString + "\" is: " + length);

        scanner.close();
    }
}
    

