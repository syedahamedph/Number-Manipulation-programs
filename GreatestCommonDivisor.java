import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers to find the GCD of them ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd + ".");

        scanner.close();

    }

    public static int findGCD(int a, int b) {

        int g = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                g = i;
            }

        }
        return g;
    }
}
