import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8
        Scanner scanner = new Scanner(System.in);

        int number = 9;
        System.out.println("Guess the number between 1 and 10: ");
        int guess = scanner.nextInt();

        while (guess != number) {

            if (guess > number) {
                System.out.println("The stored number is lover");

            }else {
                System.out.println("The stored number is higher");
            }
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();

        }
        System.out.println("Yaay.");


    }
}