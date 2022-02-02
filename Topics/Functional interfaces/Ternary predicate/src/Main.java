class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (a, b, c) -> {
        return a != b && a != c && b != c ? true : false;
    };

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        boolean test(int a, int b, int c);
    }
}