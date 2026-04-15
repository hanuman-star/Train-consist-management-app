import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display bogies after insertion
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Step 4: Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 5: Check existence of Sleeper
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + exists);

        // Step 6: Final state
        System.out.println("Final Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}