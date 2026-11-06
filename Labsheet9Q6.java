import java.util.ArrayList;
import java.util.Scanner;

public class Labsheet9Q6 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Data Structures");
        courses.add("Database Management");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course name to search: ");
        String courseName = scanner.nextLine();

        if (courses.contains(courseName)) {
            System.out.println(courseName + " exists in the course list.");
        } else {
            System.out.println(courseName + " does not exist in the course list.");
        }
        scanner.close();
    }
}
