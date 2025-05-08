import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = number;
        int k = number;
        int f = number;
        int dig = 0;
        int r = 0;

        while (temp > 0) {
            dig++;
            temp = temp / 10;
        }

        while (k > 0) {
            int lastno = k % 10;
            r = r + (int) Math.pow(lastno, dig);
            k = k / 10;
        }

        if (r == f) {
            System.out.println(r + " is an Armstrong number.");
        } else {
            System.out.println(r + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
