import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("the first   " + n + " prime numbers are ");
        int count = 0;
        int number = 2;
        while (count < n) {
            if (checkPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
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
