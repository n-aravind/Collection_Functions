package codingbat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(t -> t>=0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-1);
        list.add(0);
        list.add(2);
        NoNeg noNeg = new NoNeg();
        System.out.println(noNeg.noNeg(list));
    }


}
