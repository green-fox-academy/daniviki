import java.util.Arrays;
import java.util.List;

public class Exercise8 {
    public static void main(String[] args) {
        //Write a Stream Expression to concatenate a Character list to a string!
        List<Character> charList = Arrays.asList('g','r','e','e','n','f','a','x');

        String newString = charList.stream()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        System.out.println(newString);
    }
}
