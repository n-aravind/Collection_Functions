package codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(t->(t.contains("z")==false)).collect(Collectors.toList());

    }
}
