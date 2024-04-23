package task12;

import java.util.ArrayList;

public class RemoveArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        System.out.println("ArrayList before removing elements:");
        System.out.println(stringList);

         // Remove all elements from the ArrayList
        // stringList.clear();



        // Remove all elements from the ArrayList without using clear()
        while (!stringList.isEmpty()) {
            stringList.remove(0);
        }

        System.out.println("ArrayList after removing elements:");
        System.out.println(stringList);
    }
    
}
