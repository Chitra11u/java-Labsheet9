import java.util.ArrayList;
import java.util.LinkedList;

public class Labsheet9Q14 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        arrayList.add(1, "JavaScript");
        linkedList.add(1, "JavaScript");

        arrayList.remove(2);
        linkedList.remove(2);

        System.out.println("ArrayList get(1): " + arrayList.get(1));
        System.out.println("LinkedList get(1): " + linkedList.get(1));

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        System.out.println("ArrayList iteration: " + arrayList);
        System.out.println("LinkedList iteration: " + linkedList);
    }
}
