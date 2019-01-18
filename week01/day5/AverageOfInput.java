import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add five numbers: ");
        int sum = 0;
        double av = 0;
        for ( int i = 0; i < 5; i++) {
            int nums = scanner.nextInt();
            sum = sum + nums;
            av = sum / 5;
        }
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        System.out.println(sum);
        System.out.println(av);

    }
}
