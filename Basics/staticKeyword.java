// static Variables
class Counter {
    static int count = 0; // Shared across ALL instances
    int instanceNum = 0;  // Unique copy per instance

    public Counter() {
        count++;
        instanceNum++;
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(Counter.count);   // Prints: 3 (Shared!)
        System.out.println(c1.instanceNum); // Prints: 1 (Unique)
        System.out.println(c2.instanceNum); // Prints: 1 (Unique)
    }
}


// static Methods
// 1. They CANNOT access non-static (instance) variables or methods directly.
// 2. They CANNOT use the this or super keywords. (There is no this instance available!).
// 3. Non-static methods, however, can access static members freely.
class MathUtils {
    // Utility method: No object state required
    public static int add(int a, int b) {
        return a + b;
    }
}
// Invocation
//int result = MathUtils.add(10, 20); // No 'new MathUtils()' needed!
class Example {
    int instanceVar = 10;
    static int staticVar = 20;

    public static void staticMethod() {
        System.out.println(staticVar);   // LEGAL
        // System.out.println(instanceVar); // COMPILE ERROR! No instance exists.
    }
}


// static Blocks - used to initialize static variables or perform one-time class setup.
class DatabaseConfig {
    public static String connectionUrl;

    // Static Initialization Block
    static {
        System.out.println("1. Class loaded into memory!");
        connectionUrl = "jdbc:mysql://localhost:3306/db";
    }

    public static void main(String[] args) {
        System.out.println("2. main() method starting...");
        System.out.println("Connection URL: " + connectionUrl);
    }
}


// static Nested Classes
class Outer {
    static class StaticInner {
        void display() {
            System.out.println("I don't need an instance of Outer to exist!");
        }
    }
}

class Test {
    public static void main(String[] args) {
        // Instantiated directly using Outer class name
        Outer.StaticInner inner = new Outer.StaticInner();
        inner.display();
    }
}