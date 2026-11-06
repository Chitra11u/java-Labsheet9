import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ListIterator;

public class Labsheet9Q15 {
    public static void main(String[] args) {
        ArrayList<String> studentRecords = new ArrayList<>();
        HashSet<Integer> uniqueIds = new HashSet<>();
        TreeSet<Integer> sortedIds = new TreeSet<>();

        studentRecords.add("Alice");
        studentRecords.add("Bob");
        studentRecords.add("Charlie");

        uniqueIds.add(201);
        uniqueIds.add(202);
        uniqueIds.add(201);

        sortedIds.add(205);
        sortedIds.add(201);
        sortedIds.add(203);

        System.out.println("ArrayList Records: " + studentRecords);
        System.out.println("HashSet Unique IDs: " + uniqueIds);
        System.out.println("TreeSet Sorted IDs: " + sortedIds);

        studentRecords.remove("Bob");
        uniqueIds.remove(202);
        sortedIds.remove(203);

        System.out.println("After Removal ArrayList: " + studentRecords);
        System.out.println("Contains Charlie? " + studentRecords.contains("Charlie"));
        System.out.println("Total records: " + studentRecords.size());

        System.out.println("\nListIterator Traversal on ArrayList:");
        ListIterator<String> listIterator = studentRecords.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Index " + listIterator.nextIndex() + ": " + listIterator.next());
        }
    }
}
