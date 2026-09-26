class InvalidAgeException extends Exception {
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionChaining {
    public void main(String[] args) {
        try {
            causeException(); // Call method that causes an exception
        } catch (InvalidAgeException e) {
            e.printStackTrace();  // Print the full error stack trace
        }
    }

    void causeException() throws InvalidAgeException {
        try {
            int result = 10 / 0;  // Causes ArithmeticException (Divide by Zero)
        } catch (ArithmeticException e) {
            // Wrapping ArithmeticException inside InvalidAgeException
            throw new InvalidAgeException("Invalid age operation occurred!", e);
        }
    }
}
