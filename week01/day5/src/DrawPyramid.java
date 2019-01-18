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
        int number = scanner.nextInt();
        String star = "*";
        String space = " ";

        for(int i = number; i < number + 1; i--) {

            for(int j = 1; j <= number ; j++) {
                System.out.print(space);
            }
            System.out.println();

            for(int k = 1; k <= number; k++ ) {
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println();


        //A
        /*for (int i = lines; i > 0; i--) {

            //B
            for (int j = i; j < lines + 1; j++) {
                System.out.print("%");
            }
            System.out.println();

            //C
            for (int k ; ; ) {
            }


        }*/
    }
}