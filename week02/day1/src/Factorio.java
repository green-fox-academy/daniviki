public class Factorio {
    public static void main(String[] args) {

        int a = 3;
        a = factorio(a);
        System.out.println(a);

    }
    public static int factorio(int input ) {
        int fact = 1;
        for (int i = 1; i < input + 1; i++) {
            fact *= i;

        }


        return fact;
    }

}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial