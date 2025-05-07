
import java.util.*;

public class CitizenFinder {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        // Check eligibility for a senior citizen discount
        if (age >= 60) {
            System.out.println("You are eligible for a senior citizen discount.");
        } else {
            System.out.println("You are not eligible for a senior citizen discount.");
        }
    }

}
