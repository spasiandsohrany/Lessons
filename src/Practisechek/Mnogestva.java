package Practisechek;

import java.util.HashSet;
import java.util.Set;

public class Mnogestva {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        Set<Integer> s2 = new HashSet<Integer>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        s2.add(6);
        symmetricDifference(s1,s2);
    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set11 = new HashSet<>(set1);
        Set<T> set22 = new HashSet<>(set2);
        set11.removeAll(set2);
        set22.removeAll(set1);
        set11.addAll(set22);
        System.out.println(set11);
        return set11;
    }
}
