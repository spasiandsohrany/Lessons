package Practisechek;

import java.util.Arrays;

public class Ascii {
    public static void main(String[] args) {

    }

public static class AsciiCharSequence implements CharSequence {
    private byte[] b;

    public AsciiCharSequence(byte[] b) {
        this.b = b;
    }

    @Override
    public int length() {
        return b.length;
    }


    @Override
    public char charAt(int index) {
        return (char) (b[index] & 0xff);
    }


    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(b, start, end));
    }

    @Override
    public String toString() {
        return new String(b);
    }
}
}
