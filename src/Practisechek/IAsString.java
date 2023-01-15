package Practisechek;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class IAsString {
    public static void main(String[] args) {
        byte[] array = {48, 49, 50, 51};
        Charset charset = StandardCharsets.US_ASCII;
        InputStream inputStream = new ByteArrayInputStream(array);
        try {
            System.out.println(readAsString(inputStream, charset));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        while (inputStreamReader.ready()){
            char b = (char) inputStreamReader.read();
            stringBuilder.append(b);
        }
        return stringBuilder.toString();
    }
}
/*
    int bs = 1024;
    char[] buf = new char[bs];
    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
    StringBuilder stringBuilder = new StringBuilder();
    for (int ch; (ch = inputStreamReader.read(buf, 0, buf.length)) > 0; ) {
            stringBuilder.append(buf, 0, ch);
            }
            return stringBuilder.toString()

 */