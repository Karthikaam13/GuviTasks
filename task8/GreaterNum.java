package task8;

import java.util.Scanner;

public class GreaterNum {
   

    public static void main(String[] args)
    { // Method 1
        int int_a = 10;
        int int_b = 15;
        int int_c = 7;
        int int_d = 13;

        if(int_a+int_b > int_c+int_d)
         {

            System.out.println("The sum of a and b is greater than sum of c and d");

        }
        else
         { System.out.println("The sum of a and b is not  greater than sum of c and d");


        }

        // Method 2
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the a value");
        int a =scanner.nextInt();

        System.out.println("Enter the b value");
        int b =scanner.nextInt();

        System.out.println("Enter the c value");
        int c =scanner.nextInt();

        System.out.println("Enter the d value");
        int d =scanner.nextInt();
        
        if( a+b > c+d) 
        {
            
            System.out.println("The sum of a and b is greater than sum of c and d");


        }
        else
         { System.out.println("The sum of a and b is not  greater than sum of c and d");


        }
    }
    
}
