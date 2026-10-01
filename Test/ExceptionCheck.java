import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionCheck {
    public static void main(String[] args) throws IOException {
        System.out.println("parent");
        String fileName = "StringTest1.java";
        FileReader fr = new FileReader(fileName);
    }
}
