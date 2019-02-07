import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLetterTest {
    @Test
    public void countLettersTest_ReturnsMap() {
        CountLetters letterNums = new CountLetters();
        Map<Character, Integer> numOfLetters = letterNums.countLetters("greenfox");

        Map<Character, Integer> testMap = new HashMap<>();
        testMap.put('g', 1);
        testMap.put('r', 1);
        testMap.put('e', 2);
        testMap.put('n', 1);
        testMap.put('f', 1);
        testMap.put('o', 1);
        testMap.put('x', 1);

        assertEquals(testMap, numOfLetters);
    }
}
