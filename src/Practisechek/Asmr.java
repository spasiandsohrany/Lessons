package Practisechek;

import java.util.Scanner;

public class Asmr {
    public static void main(String[] args) {
        System.out.println("хуи");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(sum(a, b));
    }

    public static int sum(int a, int b) {
        return (a + b);
    }
}

