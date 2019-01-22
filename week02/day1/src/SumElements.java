public class SumElements {
    public static void main(String[] args) {

        int lines = 5;
        for( int i = 0; i <= 5; i++ ) {
            for (int j = 0; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }

            System.out.println();
        }



    }
}

/*
int[] r = {54, 23, 66, 12};
System.out.println((r[1] + r[2]));
*/
// - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element
