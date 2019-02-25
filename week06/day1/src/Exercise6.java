import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a string: ");
        String string = scanner.nextLine();

        String isUp = string.chars()
                .filter(x -> Character.isUpperCase(x))
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        System.out.println(isUp);
    }
}
