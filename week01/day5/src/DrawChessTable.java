import java.util.Scanner;
public class DrawChessTable {
    // Crate a program that draws a chess table like this
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    //


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the number of the lines of the pyramid: ");
        int chess = scanner.nextInt();
        String thing = "%";
        String space = " %";

        for (int i = chess; i < chess + 1; i--) {

            for (int j = 1; j <= chess; j++) {
                System.out.print(space);
            }
            System.out.println();

            for (int k = 1; k <= chess; k++) {
                System.out.print(thing);
            }
            System.out.println();
        }
        System.out.println();
    }
}