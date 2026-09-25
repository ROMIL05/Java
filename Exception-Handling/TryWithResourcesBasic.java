import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesBasic {
    public static void main() {
        // Resource initialized inside try(...) is automatically closed at the end.
        String path = "/path";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.err.println("Failed to read file: " + e.getMessage());
        }
    }
}