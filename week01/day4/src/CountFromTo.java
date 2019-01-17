import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Add the second number: ");
        int secondNum = scanner.nextInt();

        if (firstNum > secondNum) {
            System.out.println("The second number should be bigger.");
        }else {
            while (firstNum < secondNum - 1) {
                firstNum += 1;
                System.out.println(firstNum);

            }


            // Create a program that asks for two numbers
            // If the second number is not bigger than the first one it should print:
            // "The second number should be bigger"
            //
            // If it is bigger it should count from the first number to the second by one
            //
            // example:
            //
            // first number: 3, second number: 6, should print:
            //
            // 3
            // 4
            // 5
        }
    }
}