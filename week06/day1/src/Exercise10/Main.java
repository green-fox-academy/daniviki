package Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Create a Fox class with 3 properties (name, color, age) Fill a list with at least 5 foxes and:

        Write a Stream Expression to find the foxes with green color!
        Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        Write a Stream Expression to find the frequency of foxes by color!*/
public class Main {
    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Joseph", "green", 2));
        foxes.add(new Fox("Vuk", "green", 6));
        foxes.add(new Fox("Felix", "green", 3));
        foxes.add(new Fox("Foxi", "yellow", 10));
        foxes.add(new Fox("Csepel", "brown", 7));

        foxes.stream()
                .filter(fox -> fox.color == "green" && fox.age < 5)
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s.name));
    }
}
