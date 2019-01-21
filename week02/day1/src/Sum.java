public class Sum {
    public static void main(String[] args) {

        int a = 9;
        a = sum(a);
        System.out.println(a);
    }
    public static int sum(int input ) {

        int sum = 0;
        for (int i = 1; i < input + 1; i++) {
            sum += i;

        }

        return sum;
    }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer