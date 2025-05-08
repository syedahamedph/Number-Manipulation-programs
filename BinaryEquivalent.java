import java.util.Scanner;

public class BinaryEquivalent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();
        int originalNumber = number;

        if (number == 0) {
            System.out.println("The binary equivalent of 0 is 0.");
            return;
        }

        String binary = "";

        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }

        System.out.println("The binary equivalent of " + originalNumber + " is " + binary + ".");
        scanner.close();
    }
}
