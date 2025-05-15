public class PerfectSquareChecker {

    public static boolean isPerfectSquare(int n) {
        if (n == 1)
            return true;

        int left = 1;
        int right = n / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqt = (long) mid * mid;

            if (sqt == n)
                return true;
            else if (sqt > n)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int num = 50;
        if (isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
}
