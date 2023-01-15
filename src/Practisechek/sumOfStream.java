package Practisechek;

import java.io.*;

import static java.lang.System.out;

public class sumOfStream {
    public static void main(String[] args) throws IOException {
        byte[] original = {1, -2, -3, 4, 5};
        InputStream inputStream = new ByteArrayInputStream(original);
        OutputStream outputStream = new PrintStream(System.out);
        while (inputStream.available() > 0) {
            byte b = (byte) inputStream.read();
            if (b % 2 == 0) {
                outputStream.write(b);
            }
        }
        outputStream.flush();
    }

    public static void sumOfStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        while (inputStream.available() > 0) {
            byte b = (byte) inputStream.read();
            if (b % 2 == 0) {
                outputStream.write(b);
            }
        }
        outputStream.flush();
    }
}
