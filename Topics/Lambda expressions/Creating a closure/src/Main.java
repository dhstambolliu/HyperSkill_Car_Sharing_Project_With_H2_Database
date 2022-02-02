import java.util.function.UnaryOperator;

class PrefixSuffixOperator {

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = x -> {
        return  new StringBuilder().append(PREFIX).append(x.trim()).append(SUFFIX).toString();
    };// write your code here
}