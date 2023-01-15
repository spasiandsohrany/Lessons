package Practisechek;

import java.util.function.UnaryOperator;

public class UnaryOp {
    public static void main(String[] args) {
        System.out.println(sqrt().apply(5));

    }

    public static UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }
}
