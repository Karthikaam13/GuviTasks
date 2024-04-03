package task9;

public class Pattern1 {

    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern
        int num = 1; // Initial number to start the pattern
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); 
                num++; 
            }
            System.out.println(); 
        }
    }
    
}
