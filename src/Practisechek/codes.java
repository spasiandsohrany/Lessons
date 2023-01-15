package Practisechek;

import java.math.BigInteger;

public class codes {
    public static void main(String[] args) {

    }

public static BigInteger factorial(int value) {
    if (value <= 1) {
        return BigInteger.valueOf(1);
    } else {
        return BigInteger.valueOf(value).multiply(factorial(value - 1));
    }
}

}
