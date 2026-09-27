// Superclass
class Application {
    // Method to be overridden
    public void purpose() {
        System.out.println("Application Entertains Ppls.");
    }
}

// Subclass 1
class Instagram extends Application {
    @Override
    public void purpose() {
        System.out.println("Scroll Infinite Reels.");
    }
}

// Subclass 2
class Whatsapp extends Application {
    @Override
    public void purpose() {
        System.out.println("Chatting.");
    }
}

// Subclass 3
class Linkedin extends Application {
    @Override
    public void purpose() {
        System.out.println("Find Jobs.");
    }
}

// Main class
public class DynamicDispatchBasic {
    public static void main(String[] args) {
        // Superclass reference pointing to a subclass object
        Application myApp;

        // Point to a Instagram object
        myApp = new Instagram();
        myApp.purpose(); // Calls Instagram's version of purpose()

        // Point to a Whatsapp object
        myApp = new Whatsapp();
        myApp.purpose(); // Calls Whatsapp's version of purpose()

        // Point to a LinkedIn object
        myApp = new Linkedin();
        myApp.purpose(); // Calls Linkedin's version of purpose()
    }
}
