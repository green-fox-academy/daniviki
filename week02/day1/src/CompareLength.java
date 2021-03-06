import java.lang.reflect.Array;
import java.util.Arrays;

public class CompareLength {
    public static void main(String[] args) {

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5};

        int p1Length = p1.length;
        int p2Length = p2.length;

        if (p2Length > p1Length) {
            System.out.println(p2Length);
        }

    }
}
// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`