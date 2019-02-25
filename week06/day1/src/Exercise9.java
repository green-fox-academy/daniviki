import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Exercise9 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the frequency of characters in a given string!

        String string = "greeeeeeeenfox";

        Map<Character, Integer> frequencies = string.chars().boxed()
                .collect(toMap(
                        k -> (char) k.intValue(),                    // key = char
                        v -> 1,                                      // 1 occurence
                        (a, b) -> Integer.sum(a, b)));               // counting

        System.out.println("Frequencies:\n" + frequencies);
    }
}
