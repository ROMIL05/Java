package packageB;

import packageA.Parent;

// Different Package Non-Subclass (No, No, No, Yes)
public class DiffPkgTester {
    public static void main(String[] args) {
        // Testing Non-Subclass via object creation
        Parent p = new Parent();
        System.out.println("\nTesting Different Package Non-Subclass...");
        // System.out.println(p.privateVar);   // ERROR
        // System.out.println(p.defaultVar);   // ERROR
        // System.out.println(p.protectedVar); // ERROR -> Non-subclasses in different packages cannot see protected items
        System.out.println(p.publicVar);    // YES
    }
}
