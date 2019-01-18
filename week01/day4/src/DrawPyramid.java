import java.util.Scanner;
public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add the number of the lines of the pyramid: ");
            int rows = scanner.nextInt();

            for (int i = rows; i > 0; i--) {


                for (int space = 1; space <= rows - i; ++space) {
                    System.out.print("  ");


                }
                System.out.println();

            }


        }
}
