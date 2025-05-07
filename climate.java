import java.util.Scanner;

public class climate {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        // Assign a category to the temperature
        if (temperature < 0) {
            System.out.println("The temperature " + temperature + " is categorized as Freezing.");
        } else if (temperature >= 0 && temperature <= 15) {
            System.out.println("The temperature " + temperature + " is categorized as Cold.");
        } else if (temperature > 15 && temperature <= 25) {
            System.out.println("The temperature " + temperature + " is categorized as Moderate.");
        } else if (temperature > 25 && temperature <= 35) {
            System.out.println("The temperature " + temperature + " is categorized as Warm.");
        } else {
            System.out.println("The temperature " + temperature + " is categorized as Hot.");

        }
        scanner.close();
    }

}
