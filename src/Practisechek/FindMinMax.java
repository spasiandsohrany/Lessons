package Practisechek;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class FindMinMax {
    public static void main(String[] args) {
       /* MinMax minmax = Stream.of(2, 11, 1, 5, 7, 8, 12)
                .collect(Collectors.teeing(
                        minBy(Comparator.naturalOrder()),
                        maxBy(Comparator.naturalOrder()),
                        (Optional<Integer> a, Optional<Integer> b) -> new MinMax(a.orElse(Integer.MIN_VALUE), b.orElse(Integer.MAX_VALUE))));
        System.out.println(minmax.toString());

        */
        Stream<Integer> stream = Stream.of(123, 54325, 456, 567, 768, 7689, 78, 35, 132);
        Comparator<? super Integer> comparator = Integer::compare;
        BiConsumer<? super Integer, ? super Integer> biConsumer = (x1, x2) -> System.out.println("min: " + x1 + "\nmax: " + x2);
        findMinMax(stream, comparator, biConsumer);

    }

    public static <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order, BiConsumer<? super T, ? super T> minMaxConsumer) {
        stream.collect(Collectors.teeing(
                Collectors.minBy(order),
                Collectors.maxBy(order),
                (min, max) -> {
                    minMaxConsumer.accept(min.orElse(null), max.orElse(null));
                    return minMaxConsumer;
                }));
    }


    //(Optional<Integer> min, Optional<Integer> max) -> new BiConsumer<>(min, max) {
        /*Optional<? extends T> min = stream.min(order);
        Optional<? extends T> max = stream.max(order);

        min.ifPresent(minValue -> max.ifPresent(maxValue -> minMaxConsumer.accept(minValue, maxValue)));
        if (!min.isPresent()) {
            minMaxConsumer.accept(null, null);
        }*/
}


