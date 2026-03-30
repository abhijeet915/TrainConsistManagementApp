import java.util.Scanner;
import java.util.regex.*;

// Main class
public class TrainConsistApp {

    // Method to validate Train ID
    public static boolean isValidTrainID(String trainId) {
        String trainRegex = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(trainRegex);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    // Method to validate Cargo Code
    public static boolean isValidCargoCode(String cargoCode) {
        String cargoRegex = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(cargoRegex);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // Step 2: Validate Train ID
        if (isValidTrainID(trainId)) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        // Step 3: Validate Cargo Code
        if (isValidCargoCode(cargoCode)) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        scanner.close();
    }
}