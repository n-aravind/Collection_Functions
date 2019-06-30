package codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(t-> (t<13 || t>19)).collect(Collectors.toList());
    }

}
