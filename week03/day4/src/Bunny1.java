public class Bunny1 {
    public static void main(String[] args) {
        System.out.println(bunnyEars(3));
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    }
    static int bunnyEars (int n) {

        if (n <0) {
            return 0;
        }else{

            return n*2;

        }



    }
}
