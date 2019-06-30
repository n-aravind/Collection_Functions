package codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class NoY {
    public List<String> noYY(List<String> strings) {
        return strings
                .stream()
                .filter(t->(t.length()==0||(t.length()>0&&t.charAt(t.length()-1)!='y')&& !t.contains("yy"))).map(t->t+="y")
                .collect(Collectors.toList());
    }

}
