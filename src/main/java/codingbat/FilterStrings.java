package codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
    public List<String> search(List<String> list) {
        return list.stream().filter(t->(t.charAt(0)=='a'&&t.length()==3)).collect(Collectors.toList());
    }
}
