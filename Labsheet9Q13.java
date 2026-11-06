import java.util.ArrayList;
import java.util.ListIterator;

public class Labsheet9Q13 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Mathematics");
        courses.add("Physics");
        courses.add("Chemistry");
        courses.add("Biology");
        courses.add("Computer Science");

        ListIterator<String> iterator = courses.listIterator();

        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            System.out.println("Index: " + iterator.nextIndex() + ", Element: " + iterator.next());
        }

        System.out.println("\nBackward Traversal:");
        while (iterator.hasPrevious()) {
            System.out.println("Index: " + iterator.previousIndex() + ", Element: " + iterator.previous());
        }
    }
}
