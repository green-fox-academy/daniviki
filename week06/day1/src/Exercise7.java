import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
                "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        List<String> findCities = cities.stream()
                .filter(x -> x.startsWith("r".toUpperCase()) )
                .collect(Collectors.toList());
        System.out.println(findCities);
    }
}
