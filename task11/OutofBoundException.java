package task11;

public class OutofBoundException {

    public static void main(String[] args){

        //ArrayOutofBoundException
        try{
            int[] aob = new int[5];
            System.out.println(aob[5]);

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured"  +  e.getMessage());
        }
        // StringIndexOutofBoundException
        try{
            String str = "Hello Guvi";
            System.out.println(str.charAt(10));
        
        } catch(StringIndexOutOfBoundsException e )
        {
            System.out.println("StringIndexOutofBoundException occured" + e.getMessage());
         }

        
    }
    
}
