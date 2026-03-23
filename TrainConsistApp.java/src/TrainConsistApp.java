import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App - UC2 ===");

        // Initialize empty list for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display list after insertion
        System.out.println("Passenger bogies after addition: " + passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("Passenger bogies after removing AC Chair: " + passengerBogies);

        // Check if Sleeper bogie exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does the train have Sleeper bogie? " + hasSleeper);

        // Final list state
        System.out.println("Final bogie list: " + passengerBogies);
    }
}