import java.util.Scanner;

public class GreatesOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three number to check the greatest");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int gre = num1;
        if (num2 > gre) {
            gre = num2;
        }
        if (num3 > gre) {
            gre = num3;
        }
        System.out.println("greater is :" + gre);
    }

}
