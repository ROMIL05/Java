// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class CastingBasic {
    public static void main(String[] args) {
        // Upcasting (Implicit Casting)
        Animal myAnimal = new Dog(); // Dog object stored in Animal reference
        myAnimal.makeSound(); // Calls overridden method in Dog

        // Checking type with instanceof
        if (myAnimal instanceof Dog) {
            System.out.println("myAnimal is an instance of Dog");

            // Downcasting (Explicit Casting)
            Dog myDog = (Dog) myAnimal; // Safe because we checked with instanceof
            myDog.bark(); // Calls Dog specific method
        }

        // Example of incorrect downcasting
        Animal anotherAnimal = new Animal();
        if (anotherAnimal instanceof Dog) {
            Dog wrongDog = (Dog) anotherAnimal; // EXCEPTION -> This would cause ClassCastException
            wrongDog.bark();
        } else {
            System.out.println("anotherAnimal is NOT an instance of Dog, so downcasting is not possible.");
        }
    }
}
