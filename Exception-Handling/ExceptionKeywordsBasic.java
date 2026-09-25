import java.io.FileReader;
import java.io.IOException;

public class ExceptionKeywordsBasic {
    // 1. 'throws' declares that this method MIGHT throw a checked exception
    public static void readFile(String filePath) throws IOException {
        if (filePath == null) {
            // 2. 'throw' explicitly triggers an exception
            throw new IllegalArgumentException("File path cannot be null!");
        }

        FileReader reader = new FileReader(filePath); // Can throw IOException
        reader.close();
    }

    public static void main(String[] args) {
        // 3. 'try' block wraps risky code
        try {
            readFile(null);
        }
        // 4. 'catch' block handles specific exception types
        catch (IllegalArgumentException e) {
            System.err.println("Invalid Argument: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File I/O Error: " + e.getMessage());
        }
        // 5. 'finally' block ALWAYS runs (cleanup code)
        finally {
            System.out.println("Execution complete. Cleaning up resources...");
        }


        // Multi-catch
        try {
            int result = 10 / 0;
            int[] arr = new int[2];
            arr[5] = 10;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Math or Array error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finallyyyyy");
        }
    }
}