import java.util.ArrayList;
import java.util.List;

public class Sum {
    private List<Integer> numbers;
    public int getSum (List<Integer> nums) {
        numbers = nums;
        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
