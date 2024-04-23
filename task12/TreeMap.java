package task12;
import java.util.*;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        java.util.TreeMap<Integer, String> employeeMap = new java.util.TreeMap<>();

        // Add some employees to the TreeMap
        employeeMap.put(101, "Karthikaa");
        employeeMap.put(102, "Vilva");
        employeeMap.put(103, "Guvi");
        employeeMap.put(104, "Mohandass");
        employeeMap.put(105, "Ravi");

       // Create a TreeSet to store names in alphabetical order
       TreeSet<String> namesSet = new TreeSet<>(employeeMap.values());

       // Print names of all employees in alphabetical order
       System.out.println("Names of all employees in alphabetical order:");
       for (String name : namesSet) {
           System.out.println(name);
       }
    }


    
}
