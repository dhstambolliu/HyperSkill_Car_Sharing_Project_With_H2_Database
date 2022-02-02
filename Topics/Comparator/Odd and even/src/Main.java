import java.util.Comparator;
import java.util.List;

class Utils {

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        Comparator<Integer> byOddFirst = (i1, i2) -> (i1 | 1) == i1 ? -1 : (i2 | 1) > i2 ? 1 : 0;
        Comparator<Integer> byOddAscEvenDesc = (i1, i2) -> {
            if ((i1 | 1) == i1 && (i2 | 1) == i2) {
                return Integer.compare(i1, i2);
            } else if ((i1 | 1) > i1 && (i2 | 1) > i2) {
                return Integer.compare(i1, i2) * -1;
            } else {
                return 0;
            }
        };
        numbers.sort(byOddFirst);
        numbers.sort(byOddAscEvenDesc);
        return numbers;
    }
}