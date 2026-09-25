import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        // 1. Declaration: Map<KeyType, ValueType> map = new HashMap<>();
        Map<String, Integer> phoneBook = new HashMap<>();

        // 2. Add / Put elements (Key, Value)
        phoneBook.put("Alice", 1111);
        phoneBook.put("Bob", 2222); // Note: put() is the method name
        phoneBook.put("Bob", 2222);
        phoneBook.put("Charlie", 3333);

        // 3. Updating a value (Calling put() with an EXISTING key overwrites the old value!)
        phoneBook.put("Alice", 9999); // "Alice" key now maps to 9999 instead of 1111

        // 4. Fetching values by Key
        Integer aliceNum = phoneBook.get("Alice"); // 9999
        Integer unknown = phoneBook.get("David");   // Returns null if key doesn't exist

        // 5. Get with Default (Prevents null pointer crashes!)
        Integer davidNum = phoneBook.getOrDefault("David", 0000); // Returns 0000

        // 6. Checking existence
        boolean hasBob = phoneBook.containsKey("Bob");     // Checks if KEY exists
        boolean hasNum = phoneBook.containsValue(3333);   // Checks if VALUE exists

        // 7. Removing
        phoneBook.remove("Charlie"); // Removes key "Charlie" and its associated value

        System.out.println("Final Map: " + phoneBook);


        // Iteration
        Map<String, Double> productPrices = Map.of(
                "Apple", 0.99,
                "Banana", 0.59,
                "Mango", 1.49
        );

        // Method 1: Iterate over Key-Value pairs using EntrySet (RECOMMENDED / MOST EFFICIENT)
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println(entry.getKey() + " costs $" + entry.getValue());
        }

        // Method 2: Iterate over Keys only
        for (String key : productPrices.keySet()) {
            System.out.println("Product: " + key + " -> $" + productPrices.get(key));
        }

        // Method 3: Java 8+ forEach with Lambda
        productPrices.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
}