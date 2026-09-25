import java.util.LinkedList;
import java.util.List;

public class LinkedListBasics {
    public static void main(String[] args) {
        // Same List interface methods.
        List<String> cities = new LinkedList<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");

        cities.remove("Delhi");

        System.out.println(cities.get(0)); // "Mumbai"


        class CustomerQueue {
            public static void main(String[] args) {
                // Declaring as LinkedList to access LinkedList/Deque specific methods
                LinkedList<String> queue = new LinkedList<>();

                // 1. Initial queue
                queue.add("John");
                queue.add("Sara");
                queue.add("Alex");

                // 2. Add VIP to the very front
                queue.addFirst("Emergency-VIP");

                // 3. Serve (remove and print) the first customer
                String servedCustomer = queue.removeFirst();
                System.out.println("Served Customer: " + servedCustomer); // "Emergency-VIP"

                // 4. Print remaining line
                System.out.println("Remaining Line: " + queue); // [John, Sara, Alex]
            }
        }
    }
}


class CustomerQueue {
    public static void main(String[] args) {
        // Declaring as LinkedList to access LinkedList/Deque specific methods
        LinkedList<String> queue = new LinkedList<>();

        // 1. Initial queue
        queue.add("John");
        queue.add("Sara");
        queue.add("Alex");

        // 2. Add VIP to the very front
        queue.addFirst("Emergency-VIP");

        // 3. Serve (remove and print) the first customer
        String servedCustomer = queue.removeFirst();
        System.out.println("Served Customer: " + servedCustomer); // "Emergency-VIP"

        // 4. Print remaining line
        System.out.println("Remaining Line: " + queue); // [John, Sara, Alex]
    }
}