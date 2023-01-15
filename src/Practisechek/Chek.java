package Practisechek;

public class Chek {
    public static void main(String[] args) {
        int[] strArray = new int[]{3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(strArray);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(","+ arr[i]);
                } else {
                    stringBuilder.append(arr[i]);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
