import java.util.Scanner;
public class DrawDiagonal {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
    //
    // The square should have as many lines as the number was
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the number of the lines: ");
        int addedLines = scanner.nextInt();

        for ( int i = addedLines; i > 0; i-- ) {

            //B
            for (int j = i; j <= addedLines + 1; j++ ) {
                System.out.print("%");
            }
            System.out.println();
        }


    }



    }
