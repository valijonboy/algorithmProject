import java.util.Arrays;
import java.util.stream.Collectors;

public class AlgorithmInJava {


    public boolean isAnagramInJava(String s, String t) {
        return Arrays.stream(s.split("")).sorted().collect(Collectors.joining(""))
                .equals(Arrays.stream(t.split("")).sorted().collect(Collectors.joining("")));
    }
}
