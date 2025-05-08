import java.util.*;

public class SmallestDigit {

    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to find the smallest single number in that");
        int number = scanner.nextInt();
        int og = number;
        int min = 9;

        // Find and print the smallest digit in the number
        while (number > 0) {
            int v = number % 10;
            if (v < min) {
                min = v;

                number = number / 10;

            }

        }
        System.out.println("The smallest digit in " + og + " is " + min + ".");
    }

}
