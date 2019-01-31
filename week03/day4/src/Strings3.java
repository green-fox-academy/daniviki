public class Strings3 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".

        //NINCS KÉSZ!!

        String string = ("Viki vagyok");
        System.out.println(allStar(string, '*', 1));

    }
    static String allStar (String string, char separator, int from) {

        if (string.length() < 1) {
            return string;
        }else {
            String newString = "";
            return newString + allStar(string.substring(from * 3).toString(), separator));
        }


    }



}
