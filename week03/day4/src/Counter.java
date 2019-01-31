public class Counter {
    // Write a recursive function that takes one parameter: n and counts down from n.
    public static void main(String[] args) {
        counter(10);
    }
    static void counter (int n) {

        if (n < 0) {
            return;
        }else {
            System.out.println(n);
            counter(n - 1);
        }


    }

}
