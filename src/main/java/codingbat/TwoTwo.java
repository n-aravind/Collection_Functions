package codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo {
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(t->t*2).filter(t->t%10!=2).collect(Collectors.toList());

    }

}
