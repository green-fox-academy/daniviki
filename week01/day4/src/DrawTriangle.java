// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
import java.util.Scanner;
public class DrawTriangle {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the lines of the triangle: ");
        int lines = scanner.nextInt();
        //A
        for ( int i = lines; i > 0; i-- ) {

            //B
            for (int j = i; j < lines + 1; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
     }
}
