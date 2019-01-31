public class Strings {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.

        //MEGÉRTÉS ALATT..


        String words = "Kevés az iksz ebben a mondatban..xxxxxxxx";
        char from = 'x';
        char to = 'y';

        System.out.println(xToY(words, from, to));
    }
    public static String xToY(String string, char from, char to){
        if (string.length() < 1)
            return string;
        else {
            char first = from == string.charAt(0) ? to : string.charAt(0);

            return first + xToY(string.substring(1), from, to);
        }

    }
}
