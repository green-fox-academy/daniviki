
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 2 numbers");
        int input = scanner.nextInt();
        int inputPower = scanner.nextInt();

        System.out.println(powerN(input, inputPower));
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    }
    static int powerN (int input, int inputPower) {

        if (input < 1) {
            return 0;
        }else {
            return (int) Math.pow(input, inputPower);
        }

    }
}

