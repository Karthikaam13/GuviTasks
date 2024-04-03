package task9;

public class StarPattern {

    public static void main(String[] args) 
    {
        int row_size=5;

        //outer loop for the rows

        for(int i=0; i<=row_size; i++)
        {
           //Inner loop for columns
           for(int j =1; j<=row_size; j++)
           {
            if(j==i || j==row_size -i+1) {
                System.out.print("*");
            } else {

                System.out.print(" ");

            }

           }
           System.out.println(" ");
        }

    }
    
}
