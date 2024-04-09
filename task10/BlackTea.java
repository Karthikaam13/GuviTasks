package task10;

public class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Black Tea with hot water and black tea leaves. Brewing for 3 minutes.");
    }
    
    public static void main(String[] args) {

         // Create an array of Tea objects
         Tea[] teas = new Tea[4];
        
         // Populate the array with instances of Tea and its subclasses
         teas[0] = new Tea();
         teas[1] = new BlackTea();
         teas[2] = new GreenTea();
         teas[3] = new HerbalTea();
         
         // Iterate over the array and call prepareTea() method for each tea
         for (Tea tea : teas) {
             tea.prepareTea(); // Polymorphic method invocation
         }

        
            BlackTea blackTea = new BlackTea();
            blackTea.prepareTea();
    
            GreenTea greenTea = new GreenTea();

            greenTea.prepareTea();
    
            HerbalTea herbalTea = new HerbalTea();
            herbalTea.prepareTea();
        }
    }
    
