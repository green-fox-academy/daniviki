import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add kilometer: ");
        int enterKm = scanner.nextInt();

        System.out.println(enterKm +(" is ") + enterKm * 0.621371192 + ("miles"));





    }
}