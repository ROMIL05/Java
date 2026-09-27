import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers, square them, collect to list
        List<Integer> result = nums.stream()
                .filter(n -> n % 2 == 0) // [2,4,6,8,10]
                .map(n -> n * n) // [4,16,36,64,100]
                .collect(Collectors.toList());
        System.out.println(result); // [4, 16, 36, 64, 100]

        // Sum of all elements
        int sum = nums.stream().reduce(0, (a, b) -> Integer.sum(a, b));
        System.out.println("The actual sum is: " + sum); // 55

        // Count elements matching condition
        long count = nums.stream().filter(n -> n > 5).count();
        System.out.println("Matched Elements: " + count); // 5

        // Find first element
        Optional<Integer> first = nums.stream().filter(n -> n > 3).findFirst();
        first.ifPresent(System.out::println); // 4

        // Sort and collect
        List<String> names = List.of("Charlie", "Alice", "Bob");
        names.stream().sorted().forEach(System.out::println);

        // Group by
        Map<Boolean, List<Integer>> groups = nums.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Odd Even Groups: " + groups);
    }
}