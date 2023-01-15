package Practisechek;

import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GetSalesMap {
    public static void main(String[] args) {
        Reader reader = new StringReader("Алексей 3000\n" +
                "Дмитрий 9000\n" +
                "Антон 3000\n" +
                "Алексей 7000\n" +
                "Антон 8000");
        System.out.println(getSalesMap(reader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) throws NoSuchElementException {
        Map<String, Long> map = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            map.merge(scanner.next(), scanner.nextLong(),(aLong, aLong2) -> aLong + aLong2);
        }
        return map;
    }
}
