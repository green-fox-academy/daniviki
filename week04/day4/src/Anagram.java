import java.util.Arrays;

public class Anagram {

    public boolean isAnagram(String string1, String string2) {
        boolean f = false;
        char[] c = string1.toCharArray();
        Arrays.sort(c);
        char[] d = string2.toCharArray();
        Arrays.sort(d);
        String a = new String (c);
        String b = new String (d);
        if (a.equals(b)) {
            f=true;
        }
        return f;
    }


}
