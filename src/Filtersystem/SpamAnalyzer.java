package Filtersystem;

public class SpamAnalyzer extends KeywordAnalyzer{
    private final String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
