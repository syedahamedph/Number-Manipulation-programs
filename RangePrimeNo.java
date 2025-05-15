import java.util.Scanner;

public class RangePrimeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.println(i);

            }

        }
    }

    public static boolean checkPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
