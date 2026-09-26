import java.io.*;
import java.util.Scanner;

public class FileManagement {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- File Management Menu ---");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Display File Properties");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1: writeFile(); break;
                case 2: readFile(); break;
                case 3: displayFileProperties(); break;
                case 4: deleteFile(); break;
                case 5: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void writeFile() {
        System.out.print("Enter file name to write: ");
        String fileName = sc.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            System.out.println("Enter content to write (type 'exit' to stop):");
            while (true) {
                String content = sc.nextLine();
                if (content.equalsIgnoreCase("exit")) break;
                writer.write(content);
                writer.newLine();
            }
            System.out.println("Content written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }


    public static void readFile() {
        System.out.print("Enter file name to read: ");
        String fileName = sc.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\n--- File Content ---");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void displayFileProperties() {
        System.out.print("Enter file name to check properties: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("\n--- File Properties ---");
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("File Size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }


    public static void deleteFile() {
        System.out.print("Enter file name to delete: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully!");
            } else {
                System.out.println("Error deleting file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
