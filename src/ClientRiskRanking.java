import java.util.*;

// Client class
class Client {
    String name;
    int riskScore;       // 0-100
    double accountBalance;

    public Client(String name, int riskScore, double accountBalance) {
        this.name = name;
        this.riskScore = riskScore;
        this.accountBalance = accountBalance;
    }

    public String toString() {
        return name + "(" + riskScore + ")";
    }
}

public class ClientRiskRanking {

    // -------------------------------
    // Bubble Sort (riskScore ascending)
    // -------------------------------
    public static void bubbleSort(Client[] clients) {
        int n = clients.length;
        int swaps = 0;
        int passes = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            passes++;

            for (int j = 0; j < n - i - 1; j++) {
                if (clients[j].riskScore > clients[j + 1].riskScore) {
                    Client temp = clients[j];
                    clients[j] = clients[j + 1];
                    clients[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) break; // Early termination
        }

        System.out.println("Bubble Sort (Ascending) Result: " + Arrays.toString(clients));
        System.out.println("Passes: " + passes + ", Swaps: " + swaps);
    }

    // -------------------------------
    // Insertion Sort (riskScore DESC + accountBalance)
    // -------------------------------
    public static void insertionSort(Client[] clients) {
        for (int i = 1; i < clients.length; i++) {
            Client key = clients[i];
            int j = i - 1;

            while (j >= 0 &&
                    (clients[j].riskScore < key.riskScore ||
                            (clients[j].riskScore == key.riskScore &&
                                    clients[j].accountBalance < key.accountBalance))) {

                clients[j + 1] = clients[j]; // shift right
                j--;
            }
            clients[j + 1] = key;
        }

        System.out.println("Insertion Sort (Desc Risk + Balance) Result: " + Arrays.toString(clients));
    }

    // -------------------------------
    // Top N risky clients
    // -------------------------------
    public static void topNRiskClients(Client[] clients, int n) {
        System.out.print("Top " + n + " risky clients: ");
        for (int i = 0; i < Math.min(n, clients.length); i++) {
            System.out.print(clients[i] + " ");
        }
        System.out.println();
    }

    // -------------------------------
    // Main method
    // -------------------------------
    public static void main(String[] args) {

        Client[] clients = {
                new Client("clientC", 80, 5000),
                new Client("clientA", 20, 10000),
                new Client("clientB", 50, 7000)
        };

        // Clone arrays for separate sorts
        Client[] bubbleArr = Arrays.copyOf(clients, clients.length);
        Client[] insertionArr = Arrays.copyOf(clients, clients.length);

        // Bubble Sort ascending
        bubbleSort(bubbleArr);

        // Insertion Sort descending + accountBalance
        insertionSort(insertionArr);

        // Identify top 3 risky clients
        topNRiskClients(insertionArr, 3);
    }
}