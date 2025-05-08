import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;

        while (number >= 10) {
            number = sumOfDigits(number);
        }

        System.out.println("The single-digit sum of digits of " + originalNumber + " is " + number + ".");

        scanner.close();
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
