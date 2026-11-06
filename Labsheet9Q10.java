import java.util.ArrayList;
import java.util.HashSet;

public class Labsheet9Q10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        String[] values = {"Java", "Python", "Java", "C++", "Python"};

        for (String val : values) {
            list.add(val);
            set.add(val);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);

        System.out.println("\nExplanation:");
        System.out.println("1. Duplicates: ArrayList allows duplicate elements (" + list.size() + " total items), whereas HashSet automatically removes duplicate elements (" + set.size() + " unique items).");
        System.out.println("2. Ordering: ArrayList preserves the exact insertion order of elements, whereas HashSet does not guarantee any specific iteration order.");
    }
}
