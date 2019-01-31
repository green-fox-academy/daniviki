
// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

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

public class Logs {
    public static void main(String[] args) {

        uniqIP();

    }
    public static ArrayList<String> uniqIP (String file1) {

        Path file1Path = Paths.get(file1);
        List<String> allIP = new ArrayList<>();
        List<String> uniq = new ArrayList<>();

        try {
            List<String> allLine = Files.readAllLines(file1Path);
            for( String eachLine : allLine ) {
                allIP.add(eachLine.substring(27, 39));

            }



        }catch (IOException ex) {
            System.out.println("Hibaaaaaaa");
        }
    }
}


