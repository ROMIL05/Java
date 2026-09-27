// 'T' is a placeholder for the type we will specify later
class Box<T> {
    private T content;

    public void add(T content) {
        this.content = content;
    }

    public T getContent() {
        return this.content;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        // Create a Box specifically for Integers
        Box<Integer> intBox = new Box<>();
        intBox.add(123); // Safe
        // intBox.add("Hello"); // COMPILE ERROR -> Prevents mixing types
        int integerValue = intBox.getContent(); // No explicit type-casting needed!

        // Reuse the exact same class blueprint for Strings
        Box<String> stringBox = new Box<>();
        stringBox.add("Java");
        String stringValue = stringBox.getContent();

        System.out.println("Integer Box contains: " + integerValue);
        System.out.println("String Box contains: " + stringValue);
    }
}
