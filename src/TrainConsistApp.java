import java.util.*;
import java.util.stream.*;

// GoodsBogie class
class GoodsBogie {
    private String type;   // Cylindrical, Rectangular, Open, Box
    private String cargo;  // Petroleum, Coal, Grain, etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public void display() {
        System.out.println(type + " Bogie carrying " + cargo);
    }
}

// Main class
public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Grain"));

        // Step 2: Apply safety validation using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical") ||
                                b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        System.out.println("Goods Bogies:");
        goodsBogies.forEach(GoodsBogie::display);

        System.out.println("\nSafety Compliance Status: " +
                (isSafe ? "SAFE " : "UNSAFE "));
    }
}