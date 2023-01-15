package Practisechek;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InfinityStream {
    public static void main(String[] args) {
        int seed = 13;
        System.out.println(Arrays.toString(pseudoRandomStream(seed).toArray()));
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, i -> (i * i) / 10 % 1000).limit(10);
    }
}
