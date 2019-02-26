package Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

/*Create a Fox class with 3 properties (name, color, age) Fill a list with at least 5 foxes and:

        Write a Stream Expression to find the foxes with green color!
        Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        Write a Stream Expression to find the frequency of foxes by color!*/
public class Main {
    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Joseph", "green", 2));
        foxes.add(new Fox("Vuk", "green", 1));
        foxes.add(new Fox("Felix", "green", 6));
        foxes.add(new Fox("Foxi", "yellow", 10));
        foxes.add(new Fox("Csepel", "brown", 7));
        foxes.add(new Fox("Csopi", "green", 1));

        System.out.println("Green foxex: ");
        foxes.stream()
                .filter(fox -> fox.color == "green" )
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s.name));

        System.out.println("Green foxex under 5: ");
        foxes.stream()
                .filter(fox -> fox.color == "green" && fox.age < 5)
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s.name));

        System.out.println("Frequency of green foxes: ");
        double greenFoxes = foxes.stream()
                .filter(fox -> fox.color == "green" )
                .count();
        System.out.println((greenFoxes/ foxes.size())*100 + "%.");

    }
}
