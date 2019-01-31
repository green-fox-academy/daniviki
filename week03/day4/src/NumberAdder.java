public class NumberAdder {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    public static void main(String[] args) {
        System.out.println(numAdder(5));

    }
    static int numAdder (int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        return n + numAdder(n-1);
    }

}
