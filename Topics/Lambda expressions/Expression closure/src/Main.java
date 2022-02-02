import java.util.function.DoubleUnaryOperator;

class Operator {

    public static final int A = 10;
    public static final int B = 20;
    public static final int C = 30;

    public static DoubleUnaryOperator unaryOperator = x -> {
        return A * x * x + B * x + C;
    };
}