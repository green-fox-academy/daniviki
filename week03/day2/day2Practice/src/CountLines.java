import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.


        numberOfLines("file2.txt");
        System.out.println(numberOfLines("file2.txt"));


    }
    public static int numberOfLines (String srt) {
        try {
            Path filePath = Paths.get(srt);
            List<String> allLines = Files.readAllLines(filePath);
            int numOfLines = allLines.size();
            return numOfLines;
        }catch (IOException ex) {
            return 0;
        }
    }
}

