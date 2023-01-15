package Practisechek;


public class Perebor {
    public static void main(String[] args) {
        int[] a1 = new int[]{21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] a2 = new int[]{10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        mergeArrays(a1, a2);
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < a3.length; i++) {
            if (positionA == a1.length){
                a3[i] = a2[i - positionB];
                positionB++;
            } else if (positionB == a2.length) {
                a3[i] = a1[i - positionA];
                positionA++;
            } else if (a1[i - positionA] < a2[i - positionB]) {
                a3[i] = a1[i - positionA];
                positionB++;
            } else {
                a3[i] = a2[i - positionB];
                positionA++;
            }
        }
        return a3;
    }


}
