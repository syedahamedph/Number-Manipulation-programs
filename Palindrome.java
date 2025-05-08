import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to check whether it is palindrome or not");
        int number = scanner.nextInt();
        int k = number;

        int reversed = 0;

        while (k > 0) {
            int last = k % 10;
            reversed = (reversed * 10) + last;
            k = k / 10;
        }

        if (reversed == number) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");

        }

    }
}
