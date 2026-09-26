package packageB;

import packageA.Parent;

// Different Package Subclass (No, No, Yes, Yes)
public class DiffPkgSubclass extends Parent {
    public void testDifferentPackageSubclass() {
        System.out.println("\nTesting Different Package Subclass...");
        // System.out.println(privateVar);   // ERROR -> Private hidden
        // System.out.println(defaultVar);   // ERROR -> Default hidden outside package
        System.out.println(protectedVar); // YES (Accessible via inheritance)
        System.out.println(publicVar);    // YES
    }

    public static void main() {
        DiffPkgSubclass dfps = new DiffPkgSubclass();
        dfps.testDifferentPackageSubclass();
    }
}