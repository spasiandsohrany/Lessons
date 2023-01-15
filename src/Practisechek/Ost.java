package Practisechek;

public class Ost {
    public static void main(String[] args) {
        String m = "1111";
        System.out.println(Integer.parseInt(m, 2));
        int i = 1111;
        int c = Integer.parseInt(String.valueOf(i),2);
        System.out.println(c);//перевод в десятичную систему
        System.out.println(Integer.toBinaryString(c));

    }
}
