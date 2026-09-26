package packageA;

public class Parent {
    // Declaring the 4 types of access modifiers
    private   String privateVar   = "Private Work!";
    String defaultVar   = "Default Work!"; // default
    protected String protectedVar = "Protected Work!";
    public    String publicVar    = "Public Work!";

    public void testSameClass() {
        // Same Class -> All 4 are accessible (Yes, Yes, Yes, Yes)
        System.out.println("Testing Same Class...");
        System.out.println(this.privateVar);   // YES
        System.out.println(this.defaultVar);   // YES
        System.out.println(this.protectedVar); // YES
        System.out.println(this.publicVar);    // YES
    }
}
