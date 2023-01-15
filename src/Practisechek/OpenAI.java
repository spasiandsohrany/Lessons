package Practisechek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class OpenAI {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Создаем карту для хранения слов и их частоты появления
        Map<String, Integer> wordFrequencies = new HashMap<>();

        // Считываем текст строка за строкой
        String line;
        while ((line = reader.readLine()) != null) {
            // Разбиваем строку на слова
            String[] words = line.split("[^\\p{L}\\p{Nd}]+");
            for (String word : words) {
                // Приводим слово к нижнему регистру
                word = word.toLowerCase();
                // Если слово еще не встречалось, то добавляем его в карту с частотой 1
                if (!wordFrequencies.containsKey(word)) {
                    wordFrequencies.put(word, 1);
                } else {
                    // Иначе увеличиваем частоту появления слова на 1
                    wordFrequencies.put(word, wordFrequencies.get(word) + 1);
                }
            }
        }
        wordFrequencies.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }
}
