import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Define default sorting rule (Sort by ID ascending)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", GPA: " + gpa + ")";
    }
}

public class ComparableBasic {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Alice", 3.8));
        students.add(new Student(101, "Bob", 3.5));
        students.add(new Student(102, "Charlie", 3.9));

        // Uses Student's compareTo method automatically.
        Collections.sort(students);

        System.out.println("Sorted by ID: " + students);
    }
}