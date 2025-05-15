import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to check for prime number");
        int number = scanner.nextInt();
        int count = 0;

        // Check if the number is prime
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

}
