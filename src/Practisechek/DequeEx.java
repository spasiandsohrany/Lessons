package Practisechek;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()) {
            if (i % 2 != 0) {
                deque.addFirst(scanner.nextInt());
                i++;
            } else {
                scanner.next();
                i++;
            }
        }
        for (int x : deque) {
            System.out.print(x + " ");
        }
    }
}
