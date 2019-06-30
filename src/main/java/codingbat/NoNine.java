package codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class NoNine {
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(t -> t % 10 != 9).collect(Collectors.toList());
    }

}
