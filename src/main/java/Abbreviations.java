import java.util.HashMap;

public class Abbreviations {
    private  HashMap<String,String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();

    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviation == null) {
            return false;
        }
        return abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        if (!hasAbbreviation(abbreviation)) {
            return null;
        }
        return abbreviations.get(abbreviation);

    }

}


