import java.util.Scanner;

public class FibonacciTerm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci series for " + terms + " terms: ");

        while (terms > 0) {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;
            terms--;
        }

        scanner.close();
    }
}
