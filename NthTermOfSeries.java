import java.util.Scanner;

public class NthTermOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter the term number (n): ");
        int n = scanner.nextInt();

        // Use the formula Tn = n(n + 1)/2
        int nthTerm = n * (n + 1) / 2;

        // Display the result
        System.out.println("The " + n + "th term of the series is " + nthTerm + ".");
        scanner.close();
    }
}
