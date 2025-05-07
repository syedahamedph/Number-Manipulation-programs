import java.util.Scanner;

public class nEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        // Print the first n even numbers

        System.out.println("The first " + n + " even numbers are:");

        for (int i = 1; i <= n; i++) {

            int evennumber = i * 2;
            System.out.println(evennumber);

        }
    }
}