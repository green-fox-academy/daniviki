public class Bunny2 {
    public static void main(String[] args) {
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised ear. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
        System.out.println(bunnyEars(4));
    }

    static int bunnyEars(int n) {

        if (n > 0) {

            if (n % 2 == 0) {

                return (3 + bunnyEars(n - 1));

            }else{
                return (2 + bunnyEars(n - 1));
            }
        }
        return n;

    }


}
