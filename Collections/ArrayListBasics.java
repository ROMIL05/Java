import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListBasics {
    public static void main(String[] args) {
        // List -> Interface
        // ArrayList -> concrete class

        // 1. Declaration (Always code to the Interface: List on the left)
        List<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicates allowed!

        // 3. Insert at a specific index
        fruits.add(1, "Orange"); // Inserts "Orange" at index 1

        // 4. Access elements
        String firstFruit = fruits.get(0); // "Apple"

        // 5. Update an element
        fruits.set(2, "Blueberry"); // Replaces element at index 2

        // 6. Remove elements
        fruits.remove(3);          // Removes by index
        fruits.remove("Apple");    // Removes first occurrence of object

        // 7. Utility methods
        int size = fruits.size();           // Returns size
        boolean hasMango = fruits.contains("Mango"); // Checks existence
        boolean isEmpty = fruits.isEmpty(); // Checks if empty

        System.out.println("Final List: " + fruits);


        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Method 1: Enhanced For-Loop (Most Common & Cleanest)
        for (String name : names) {
            System.out.println(name);
        }

        // Method 2: Standard Index-based Loop (Use when index position matters)
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Index " + i + ": " + names.get(i));
        }

        // Method 3: Java 8+ ForEach with Lambda
        names.forEach(name -> System.out.println(name));

        // Method 4: Iterator (Required when removing elements DURING iteration)
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}