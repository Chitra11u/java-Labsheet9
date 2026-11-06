import java.util.ArrayList;
import java.util.HashSet;

public class Labsheet9Q12 {
    public static void main(String[] args) {
        ArrayList<String> patientNames = new ArrayList<>();
        HashSet<Integer> patientIds = new HashSet<>();

        patientNames.add("Alice Smith");
        patientNames.add("Bob Jones");
        patientNames.add("Charlie Brown");

        patientIds.add(1001);
        patientIds.add(1002);
        patientIds.add(1003);
        patientIds.add(1001);

        System.out.println("Patient Names: " + patientNames);
        System.out.println("Patient IDs: " + patientIds);

        patientNames.add("David White");
        patientIds.add(1004);

        patientNames.remove("Bob Jones");
        patientIds.remove(1002);

        System.out.println("After Removal Names: " + patientNames);
        System.out.println("After Removal IDs: " + patientIds);

        System.out.println("Contains Alice Smith? " + patientNames.contains("Alice Smith"));
        System.out.println("Contains ID 1001? " + patientIds.contains(1001));
    }
}
