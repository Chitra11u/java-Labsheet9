import java.util.LinkedList;

public class Labsheet9Q8 {
    public static void main(String[] args) {
        LinkedList<String> labQueue = new LinkedList<>();

        labQueue.addLast("Alice");
        labQueue.addLast("Bob");
        labQueue.addFirst("Charlie");
        labQueue.addLast("David");

        System.out.println("Initial Queue: " + labQueue);

        labQueue.removeFirst();
        labQueue.removeLast();

        System.out.println("Queue after removals: " + labQueue);
    }
}
