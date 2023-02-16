import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.add(89);
        deque.addLast(58);
        deque.addFirst(8);
        deque.remove();
        deque.removeFirst();
        deque.removeLast();
    }
}
