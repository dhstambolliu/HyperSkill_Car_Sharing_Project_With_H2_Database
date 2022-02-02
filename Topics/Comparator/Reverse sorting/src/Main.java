import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Utils {

    public static void sortStrings(List<String> strings) {
        // your code here
        strings.sort(Comparator.comparing(Objects::toString).reversed());
    }
}