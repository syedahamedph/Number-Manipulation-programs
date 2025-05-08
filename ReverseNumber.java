import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to reverse");
        int number = sc.nextInt();
        int temp = number;
        int reversed = 0;

        while (temp > 0) {
            int lastno = temp % 10;
            reversed = (reversed * 10) + lastno;
            temp = temp / 10;
        }

        System.out.println("Reversed Number: " + reversed);
        sc.close();
    }
}
