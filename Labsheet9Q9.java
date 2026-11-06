import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Labsheet9Q9 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");

        ListIterator<String> iterator = items.listIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Banana")) {
                iterator.set("Blueberry");
                iterator.add("Dragonfruit");
            }
        }

        System.out.println("Modified List: " + items);
    }
}
