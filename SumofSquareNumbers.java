public class SumofSquareNumbers {
    public static void main(String[] args) {
        // Calculate the sum of the squares of the first 20 natural numbers
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum = sum + (i * i);
        }

        System.out.println("The sum of the squares of the first 20 natural numbers is " + sum + ".");
    }

}
