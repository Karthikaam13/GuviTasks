package task8;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        
        // Check if number is less than or equal to 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Iterate from 2 to number/2 to check for factors
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        
    }
}
    

