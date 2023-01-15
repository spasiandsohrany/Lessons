package Practisechek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.stream.Stream;

public class OpenAIforDown {
    public static void main(String[] args) {
        HashMap<String, Integer> result = new HashMap<>();

        (new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8)))
                .lines()
                .flatMap(l -> Stream.of(l.split("[\\p{Punct}\\s]+")))
                .map(w -> w.toLowerCase())
                .forEach(w -> {
                    if(result.containsKey(w)) result.put(w, result.get(w) + 1);
                    else result.put(w, 1);
                });

        result.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if(e1.getValue() == e2.getValue()) return e1.getKey().compareTo(e2.getKey());
                    else return e2.getValue().compareTo(e1.getValue());})
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }
}
