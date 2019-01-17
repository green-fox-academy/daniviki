import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add your first number: ");
        int addedFirstNum = scanner.nextInt();
        System.out.println("Please add your second number: ");
        int addedScondNum = scanner.nextInt();
        System.out.println("Please add your third number: ");
        int addedThirdNum = scanner.nextInt();
        System.out.println("Please add your fourth number: ");
        int addedFourthNum = scanner.nextInt();
        System.out.println("Please add your fifth number: ");
        double addedFifthNum = scanner.nextInt();
        System.out.println("The sum of your number is: " + (addedFifthNum + addedFourthNum + addedThirdNum + addedScondNum + addedFirstNum));
        System.out.println("The average of your numbers is: " + (addedFifthNum + addedFourthNum + addedThirdNum + addedScondNum + addedFirstNum) / 5);


        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

    }
}
