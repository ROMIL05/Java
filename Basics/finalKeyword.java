public class finalKeyword {
    public static void main(String[] args){
        // For primitives (int, boolean, double) -> the literal value is locked.
        final double PI = 3.14159;
        // PI = 3.14; // COMPILE ERROR: Cannot assign a value to final variable 'PI'


        // Reference Variables -> reference pointer cannot point to a new object in memory, but the internal state of the object itself can still be modified!
        final StringBuilder sb = new StringBuilder("Hello");
        // 1. LEGAL: Mutating internal state of the object is allowed
        sb.append(" World"); // Modifies the object at the current memory address

        // 2. ILLEGAL: Reassigning the pointer to a new object is blocked
        // sb = new StringBuilder("Bye"); // COMPILE ERROR!
    }


    // final variable does not need to be initialized at declaration, but it must be initialized before the constructor completes,
    class User {
        private final String id; // Blank final variable

        public User(String id) {
            this.id = id; // Must be initialized inside the constructor
        }
    }


    // final method -> subclasses inheriting from this class cannot override or change the behavior of that method.
    class SecurityConfig {
        // Subclasses are forbidden from changing how authentication works
        public final void authenticate() {
            System.out.println("Validating encryption keys & tokens...");
        }
    }
    class CustomSecurityConfig extends SecurityConfig {
        // COMPILE ERROR: authenticate() in SecurityConfig cannot be overridden
        // @Override
        // public void authenticate() {
        //    System.out.println("Custom auth");
        // }
    }


    // final class -> cannot be extended by any other class (it cannot act as a parent class).
    final class ImmutableToken {
        private final String value;

        public ImmutableToken(String value) {
            this.value = value;
        }
    }
    // COMPILE ERROR: Cannot inherit from final 'ImmutableToken'
    // class CustomToken extends ImmutableToken {
    // }
}
