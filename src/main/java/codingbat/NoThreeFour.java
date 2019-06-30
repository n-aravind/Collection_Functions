package codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class NoThreeFour {
    public List<String> no34(List<String> strings) {
        return strings.stream().filter(t->(t.length()!=4 && t.length() != 3)).collect(Collectors.toList());
    }
}
