package packageA;

// Same Package Subclass (Yes, No, Yes, Yes)
class SamePkgSubclass extends Parent {
    public void testSubclass() {
        System.out.println("\nTesting Same Package Subclass...");
        // System.out.println(privateVar); // ERROR -> privateVar has private access in Parent
        System.out.println(defaultVar);   // YES
        System.out.println(protectedVar); // YES
        System.out.println(publicVar);    // YES
    }
}

// Same Package Non-Subclass (Yes, No, Yes, Yes)
public class SamePkgTester {
    public static void main(String[] args) {
        packageA.Parent p = new Parent();
        SamePkgSubclass sub = new SamePkgSubclass();
        sub.testSubclass();

        // Testing Non-Subclass via object creation
        System.out.println("\nTesting Same Package Non-Subclass...");
        // System.out.println(p.privateVar); // ERROR -> privateVar has private access in Parent
        System.out.println(p.defaultVar);   // YES
        System.out.println(p.protectedVar); // YES
        System.out.println(p.publicVar);    // YES
    }
}
