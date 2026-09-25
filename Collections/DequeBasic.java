import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeBasic {
    public static void main(String[] args) {
        // USED AS A QUEUE (FIFO)
        Queue<String> taskQueue = new ArrayDeque<>();
        taskQueue.offer("Task 1");
        taskQueue.offer("Task 2");
        taskQueue.offer("Task 3");

        System.out.println("Processing: " + taskQueue.poll()); // Task 1 (First added)
        System.out.println("Next in line: " + taskQueue.peek()); // Task 2

        // 2. USED AS A STACK (LIFO)
        Deque<String> undoStack = new ArrayDeque<>();
        undoStack.push("Action 1 - Type 'Hello'");
        undoStack.push("Action 2 - Delete 'o'");
        undoStack.push("Action 3 - Change Font");

        System.out.println("Undo: " + undoStack.pop()); // Action 3 - Change Font (Last added)
        System.out.println("Current Top: " + undoStack.peek()); // Action 2 - Delete 'o'
    }
}