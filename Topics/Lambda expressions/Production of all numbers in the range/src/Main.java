import java.util.function.*;
import java.util.stream.LongStream;


class Operator {

    public static LongBinaryOperator binaryOperator = new LongBinaryOperator() {
        @Override
        public long applyAsLong(long left, long right) {
            return LongStream.rangeClosed(left, right).reduce(1, (a, b) -> a * b);
        }
    };
}