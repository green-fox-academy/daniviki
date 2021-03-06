public class SumDigit {
    public static void main(String[] args) {
        System.out.println(summer(1128));
// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    }
    static int summer (int n) {
        if (n == 0) {
            return 0;
        }else {
            return (n % 10) + summer(n / 10);
        }

    }

}
