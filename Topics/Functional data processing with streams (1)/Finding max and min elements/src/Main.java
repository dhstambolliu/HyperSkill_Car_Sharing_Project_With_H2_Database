import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        // your implementation here

        List<? extends T> collect = stream.collect(Collectors.toList());
        T min = collect.stream().min(order).orElse(null);
        T max = collect.stream().max(order).orElse(null);
        minMaxConsumer.accept(min, max);
    }
}