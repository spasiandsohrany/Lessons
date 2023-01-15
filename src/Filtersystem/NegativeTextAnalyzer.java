package Filtersystem;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] keysign = {":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return keysign;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
