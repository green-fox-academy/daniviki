import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
// Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add your first number: " );
        int firstNum = scanner.nextInt();
        System.out.println("Add your second number: ");
        int secondNum = scanner.nextInt();

        if (firstNum > secondNum) {
            System.out.println("The bigger is: " + firstNum);
        }else {
            System.out.println("The bigger is: " + secondNum);
        }

    }
}