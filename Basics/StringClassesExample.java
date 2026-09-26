public class StringClassesExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 + " is at " + s1.hashCode());
        System.out.println(s1 + " is at " + s2.hashCode());
        // Creates a new object but doesn't modify s1
        s1.concat(" World");
        System.out.println(s1 + " is at " + s1.hashCode());
        // Output: Hello (unchanged)

        // Correct way to modify
        s1 = s1.concat(" World");
        System.out.println(s1 + " is at " + s1.hashCode());
        // Output: Hello World


        StringBuffer sb1 = new StringBuffer("Hello StringBuffer");
        StringBuffer sb2 = new StringBuffer("Hello StringBuffer");
        System.out.println("--------------------------------");
        System.out.println(sb1 + " is at " + sb1.hashCode());
        System.out.println(sb2 + " is at " + sb2.hashCode());
        sb1.append(" World"); // Modifies existing object
        System.out.println(sb1 + " is at " + sb1.hashCode());
        // Output: Hello StringBuffer World


        StringBuilder sB1 = new StringBuilder("StringBuilder");
        StringBuilder sB2 = new StringBuilder("StringBuilder");
        System.out.println("--------------------------------");
        System.out.println(sB1 + " is at " + sB1.hashCode());
        System.out.println(sB2 + " is at " + sB2.hashCode());
        sB1.append(" Programming");
        System.out.println(sB1 + " is at " + sB1.hashCode());
        // Output: StringBuilder Programming
    }
}
