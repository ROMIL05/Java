import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;

public class PriorityQueueBasic {
    public static void main(String[] args) {
        // Automatically keeps lowest numbers at the head (Min-Heap by default)
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);

        // Elements come out in sorted priority order regardless of insertion!
        System.out.println(pq.poll()); // 10
        System.out.println(pq.poll()); // 30
        System.out.println(pq.poll()); // 40

        // Max-Heap
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(10);
        maxHeap.offer(40);
        maxHeap.offer(20);
        maxHeap.offer(50);

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " "); // 50 40 20 10
        }
    }
}