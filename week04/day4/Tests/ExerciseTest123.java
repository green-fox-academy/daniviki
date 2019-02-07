import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class ExerciseTest123 {
    @Test
    public void Apple_getApple_ReturnsString() {
        Apples apple = new Apples();

        assertEquals("apple", apple.getApple());
    }

    @Test
    public void Sum_getSum_ReturnSum() {
        List<Integer> numberz = new ArrayList(Arrays.asList(new Integer[]{5, -4, 3}));
        Sum calculator = new Sum();
        Integer sum = calculator.getSum(numberz);
        assertEquals((Integer)4, sum);
    }
    @Test
    public void Sum_ZeroInput_ReturnSum() {
        List<Integer> numberz = new ArrayList<>();
        Sum calculator = new Sum();
        Integer sum = calculator.getSum(numberz);
        assertEquals((Integer)0, sum);
    }

    @Test
    public void Anagram_isAnagram_ReturnsBoolean() {
        Anagram test1 = new Anagram();
        assertEquals(true, test1.isAnagram("asdfgh", "hgfdsa"));
    }
}
