public class Strings2 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.

        //MEGÉRTÉS ALATT..

        String string = "Kevés az iksz ebben a mondatban..xxxxxxxx";
        char from = 'x';

        System.out.println(removeX(string, from));
    }
    public static String removeX(String string, char from) {
        if (string.length() < 1)
            return string;
        else {
            String newString = string.startsWith("x") ? "" : string.substring(0,1);
            return newString + removeX(string.substring(1), from);
        }

    }
}
