import java.util.TreeSet;

public class Labsheet9Q11 {
    public static void main(String[] args) {
        TreeSet<Integer> studentIds = new TreeSet<>();
        studentIds.add(105);
        studentIds.add(101);
        studentIds.add(105);
        studentIds.add(103);
        studentIds.add(107);
        studentIds.add(103);

        System.out.println("Unique Sorted IDs: " + studentIds);
        System.out.println("First ID: " + studentIds.first());
        System.out.println("Last ID: " + studentIds.last());
        System.out.println("Higher than 103: " + studentIds.higher(103));
        System.out.println("Lower than 105: " + studentIds.lower(105));
    }
}
