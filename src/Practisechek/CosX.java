package Practisechek;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class CosX {
    public static void main(String[] args) {
        System.out.println(forest(3));
        System.out.println(factorial(4));
        System.out.println(Math.pow(5, 2));
    }

    public static double forest(double value) {
        Double cos = 0.0;
        for (int i = 0; i < 5; i++) {
            cos = cos + Math.pow(-1, i) * ((Math.pow(value, i * 2) / factorial(i * 2)));
        }
        return cos;
    }

    public static double factorial(int value) {
        BigInteger c = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            c = c.multiply(BigInteger.valueOf(i));
        }
        return c.doubleValue();

    }
}
