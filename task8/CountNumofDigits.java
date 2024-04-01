package task8;

import java.util.Scanner;

public class CountNumofDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = 0;
        int temp = number < 0 ? -number : number;

        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        System.out.println("Number of digits in the integer: " + digitCount);

      
    }
}
    

