import java.util.Scanner;

public class PorNorZ {
    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is zero. ");

        }

    }

}