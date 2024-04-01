package task8;

import java.util.Scanner;

public class EvenNum {

    public static void main(String[] args)
    {
    
        System.out.println("Please enter the integer number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 ==0)
        {
              System.out.println(num + " is an even number");
        }
        else
         {
            System.out.println(num + " is an odd number");

        }


    }


    
}
