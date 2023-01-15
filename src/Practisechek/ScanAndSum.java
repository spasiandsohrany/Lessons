package Practisechek;

import java.util.Scanner;

public class ScanAndSum {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что нибудь");
        double a = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double s = scanner.nextDouble();
                a = a + s;
            } else {
                scanner.next();
            }
        }
        System.out.printf("%f", a);
    }
}
