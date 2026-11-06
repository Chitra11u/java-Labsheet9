import java.util.ArrayList;

public class Labsheet9Q3 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Emma");

        students.set(1, "Robert");
        students.remove(3);

        System.out.println("Updated List: " + students);
    }
}
