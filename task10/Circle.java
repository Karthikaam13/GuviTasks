package task10;

public class Circle 
{
     // Data member
     private double radius;

     // Constructors
     // Parameterless constructor
     public Circle() {
         // Default radius is set to 1
         this.radius = 1.0;
     }
 
     // Constructor with two arguments
     public Circle(double radius) {
         // Set the radius to the provided value
         this.radius = radius;
     }
 
     // Method to calculate the circumference
     public double calculateCircumference() {
         // Circumference formula: 2 * π * radius
         return 2 * 3.14 * radius;   //We can use Math.PI instead of 3.14

     }
 
     // Getter method for radius
     public double getRadius() {
         return radius;
     }
 
    
     public static void main(String[] args) {
         // Create Circle objects using different constructors

          // Parameterless constructor
         Circle circle1 = new Circle();  

         // Constructor with radius as argument
         Circle circle2 = new Circle(5.0); 
 
         // Calculate and print circumferences
         System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
         System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
     }


    
}
