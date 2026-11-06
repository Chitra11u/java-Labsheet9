import java.util.HashSet;

public class Labsheet9Q4 {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();
        departments.add("Computer Science");
        departments.add("Electrical");
        departments.add("Mechanical");
        departments.add("Computer Science");
        departments.add("Civil");
        departments.add("Electrical");

        System.out.println("Unique Departments: " + departments);
    }
}
