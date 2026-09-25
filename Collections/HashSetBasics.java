import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {
        // Coding to the Set interface
        Set<String> emails = new HashSet<>();

        // 1. Add elements
        emails.add("user@test.com");
        emails.add("admin@test.com");
        emails.add("support@test.com");

        // 2. Try adding a duplicate
        boolean added = emails.add("user@test.com");
        System.out.println("Was duplicate added? " + added); // false!

        // 3. Check existence
        if (emails.contains("admin@test.com")) {
            System.out.println("Admin email exists!");
        }

        // 4. Print set (Notice the order is NOT preserved)
        System.out.println("Emails Set: " + emails);

        // 5. Remove element
        emails.remove("support@test.com");
    }
}

class UniqueSortedUsernames {
    public static void main(String[] args) {
        // 1. Raw list with duplicates
        List<String> rawUsernames = List.of("alice", "bob", "alice", "charlie", "bob", "david");

        // 2. Remove duplicates AND sort by passing raw list into TreeSet
        Set<String> uniqueSortedUsers = new TreeSet<>(rawUsernames);

        // 3. Check existence
        boolean hasCharlie = uniqueSortedUsers.contains("charlie");
        System.out.println("Is 'charlie' present? " + hasCharlie); // true

        // 4. Print final sorted set
        System.out.println("Cleaned Users: " + uniqueSortedUsers);
        // Output: [alice, bob, charlie, david]
    }
}