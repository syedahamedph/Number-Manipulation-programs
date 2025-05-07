
import java.util.*;

public class DigitCounter {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = scanner.nextInt();
        int k = number;

        // Count the number of digits in the number
        int digit = 0;
        while (number > 0) {
            digit++;
            number = number / 10;
        }

        System.out.println("The number " + k + " has " + digit + " digits.");
    }

}
