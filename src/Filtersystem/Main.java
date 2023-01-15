package Filtersystem;

public class Main {
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++)
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        return Label.OK;
    }
    public static void main(String[] args) {
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 20;
        TextAnalyzer[] textAnalyzers1 = {
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers2 = {
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers3 = {
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer()
        };
        String[] badWords = {"плохой", "отстой"};
        SpamAnalyzer spamA = new SpamAnalyzer(badWords);
        NegativeTextAnalyzer negativeTA = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLongTA = new TooLongTextAnalyzer(25);
        TextAnalyzer[] analyzers = {spamA, negativeTA, tooLongTA};
        Main textFilters = new Main();
        System.out.println(textFilters.checkLabels(analyzers, "Хороший текст для теста.")); //Вариант ОК
        System.out.println(textFilters.checkLabels(analyzers, "Плохой текст для теста, так как это :( ужас.")); //NEGATIVE_TEXT по смайлику
        System.out.println(textFilters.checkLabels(analyzers, "Плохой текст для теста, полный .")); //SPAM по слову остой, Плохой не катит, потому-что с большой буквы
        System.out.println(textFilters.checkLabels(analyzers, "И это все, что вы хотели написать в комментариях. Да ну, вообще..."));//TOO_LONG потому-что более 25 символов

    }
}
