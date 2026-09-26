import java.util.Scanner;

class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Object method that adds another complex number to "this" one
    public Complex add(Complex c2) {
        double totalReal = this.real + c2.real;
        double totalImag = this.imag + c2.imag;

        return new Complex(totalReal, totalImag);
    }

    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

public class ComplexNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inputs of first object
        System.out.println("Enter First Complex Number:");
        System.out.print("Real (r1): ");
        double r1 = sc.nextDouble();
        System.out.print("Imaginary (i1): ");
        double i1 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);

        // inputs of second object
        System.out.println("\nEnter Second Complex Number:");
        System.out.print("Real (r2): ");
        double r2 = sc.nextDouble();
        System.out.print("Imaginary (i2): ");
        double i2 = sc.nextDouble();
        Complex c2 = new Complex(r2, i2);

        Complex result = c1.add(c2);

        System.out.print("\nFirst Number: ");
        c1.display();
        System.out.print("Second Number: ");
        c2.display();
        System.out.print("Sum Result: ");
        result.display();
    }
}
