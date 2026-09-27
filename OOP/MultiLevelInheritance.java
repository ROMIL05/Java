// Base class
class GrandParent {
    // Default constructor
    int d1;
    public GrandParent() {
        System.out.println("GrandParent: Default Constructor");
    }

    // Parameterized constructor
    public GrandParent(int d1) {
        this.d1 = d1;
        System.out.println("GranParent: " + d1);
    }
}

// Intermediate class (inherits from GrandParent)
class Parent extends GrandParent {
    // Default constructor
    int d2;
    public Parent() {
        //super(); // Call the default constructor of GrandParent
        System.out.println("Parent: Default Constructor");
    }

    // Parameterized constructor
    public Parent(int d1, int d2) {
        super(d1); // Call the parameterized constructor of
        this.d2 = d2;
        System.out.println("Parent: " + d1 + d2);
    }
}

// Derived class (inherits from Parent)
class Child extends Parent {
    // Default constructor
    int d3;
    public Child() {
        //super(); // Call the default constructor of Parent
        System.out.println("Child: Default Constructor");
    }

    // Parameterized constructor
    public Child(int d1, int d2, int d3) {
        super(d1, d2); // Call the parameterized constructor of Parent
        this.d3 = d3;
        System.out.println("Child: " + d1 + d2 + d3);
    }
}

// Main class to test the inheritance
public class MultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("Creating Child object with default constructor:");
        Child child1 = new Child();

        System.out.println("\nCreating Child object with parameterized constructor:");
        Child child2 = new Child(1,2,3);
    }
}