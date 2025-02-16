package no.ntnu.idatt2003;

public class ReplaceTextCommand implements TextCommand {

    private String target; //teksten som skal fjernes
    private String replacement; //teksten vi skal bytte med det som skal fjernes

    public ReplaceTextCommand(String target, String replacement) {

        if (target == null || target.isEmpty()) {
            throw new IllegalArgumentException("Target kan ikke være tomt");
        }
        if (replacement == null || replacement.isEmpty()) {
            throw new IllegalArgumentException("Replacement kan ikke være tomt");
        }

        this.target = target;
        this.replacement = replacement;

    }

    @Override
    public String execute(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Inputtekst kan ikke være null eller tomt");
        }

        if (!text.contains(target)) {
            return text;
        }

        return text.replace(target, replacement);

    }

    public String getTarget() {
        return target;
    }

    public String getReplacement() {
        return replacement;
    }

}
