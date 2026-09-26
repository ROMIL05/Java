import java.util.Scanner;

public class CustomExceptionExample {
    // Method to validate age
    static void validateAge(int age) throws AgeInvalidException {
        if (age < 0 || age > 150) {  // Invalid age range
            throw new AgeInvalidException("Age must be between 0 and 150.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        //validateAge(age);	//Will generate compile-time error due to non put in try-catch
        try {
            validateAge(age);
            System.out.println("Valid age: " + age);
        } catch (AgeInvalidException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }

        scanner.close();
    }
}


// Custom Checked Exception
class AgeInvalidException extends Exception {
    // Default constructor
    public AgeInvalidException() {
        super("Invalid age provided!"); // Default error message
    }

    // Constructor with a custom message (String)
    public AgeInvalidException(String message) {
        super(message);
    }

    // Constructor with a message and a cause (Throwable)
    public AgeInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor with only a cause (Throwable)
    public AgeInvalidException(Throwable cause) {
        super(cause);
    }
}