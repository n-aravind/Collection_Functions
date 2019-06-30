package codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class SquareFiveSix {
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(t -> t * t + 10).filter(t -> (t % 10 != 5 && t % 10 != 6)).collect(Collectors.toList());
    }
}
