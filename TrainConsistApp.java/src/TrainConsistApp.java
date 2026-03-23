import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App - UC5 ===");

        // Initialize LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies (including a duplicate)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display final formation
        System.out.println("Final train formation (unique & ordered): " + trainFormation);
    }
}