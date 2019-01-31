// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {

        copyContent("text1.txt", "text2.txt");

    }
    public static void copyContent (String copyFrom, String copyTo) {
        try {

            Path file1Path = Paths.get(copyFrom);
            List<String> file1 = new ArrayList<>();
            file1.add("Fáj a fejem");
            file1.add("Fáj a torkom");
            file1.add("Fáradt vagyok");
            Files.write(file1Path, file1);
            Path file2Path = Paths.get(copyTo);
            Files.write(file2Path, file1);
        }catch (IOException ex) {
            System.out.println("Hibaaaaaaa");
        }
    }
}

