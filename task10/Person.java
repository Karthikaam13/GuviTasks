package task10;

public class Person 
{
     // Attributes
     private String name;
     private int age;
 
     // Constructor
     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }
 
     // Getter methods
     public String getName() {
         return name;
     }
 
     public int getAge() {
         return age;
     }
 
     
     public static void main(String[] args) {
         // Create a Person object
         Person person = new Person("John", 30);
 
         // Retrieve and print the attributes
         System.out.println("Name: " + person.getName());
         System.out.println("Age: " + person.getAge());
     }


    
}
