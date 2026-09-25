import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorBasic {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Alice", 3.8));
        students.add(new Student(101, "Bob", 3.5));
        students.add(new Student(102, "Charlie", 3.9));

        // 1: Sort by GPA Desc
        students.sort(Comparator.comparingDouble((Student s) -> s.gpa).reversed());
        System.out.println("Sorted by GPA: " + students);

        // 2: Sort by Name
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("Sorted by Name: " + students);
    }
}