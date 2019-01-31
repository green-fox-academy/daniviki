import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        String file = "my-file.txt";
        manipulator(file);


    }
    public static void manipulator (String srt) {
        try {
            Path filePath = Paths.get(srt);
            List<String> newThing = new ArrayList<>();
            newThing.add("Daninger beteg Viki");
            Files.write(filePath, newThing);

        }catch (IOException ex) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}

