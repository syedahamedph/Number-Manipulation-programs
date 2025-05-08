import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number: ");
        int maxNumber = scanner.nextInt();

        int first = 0;
        int second = 1;
        System.out.print("Fibonacci series up to " + maxNumber + ": ");
        while (first <= maxNumber) {
            System.out.println(first + " ");
            int sum = first + second;
            first = second;
            second = sum;

        }

        scanner.close();
    }
}
