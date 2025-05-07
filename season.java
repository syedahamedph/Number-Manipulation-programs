import java.util.Scanner;

public class season {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        // Print the season based on the month number
        System.out.println("enter the number of month to find the season");
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("The month number " + month + " corresponds to Winter.");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("The month number " + month + " corresponds to Spring.");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("The month number " + month + " corresponds to Summer.");
        } else {
            System.out.println("The month number " + month + " corresponds to Fall.");
        }
        sc.close();
    }
}
