package no.ntnu.idatt2003;

public class WrapTextCommand implements TextCommand{

    private String prefix; 
    private String suffix; 

    public WrapTextCommand(String prefix, String suffix) {

        if (prefix == null || prefix.isEmpty()) {
            throw new IllegalArgumentException("prefiksen kan ikke være tom");
        }
        if (suffix == null || suffix.isEmpty()) {
            throw new IllegalArgumentException("suffiksen kan ikke være tom");
        }

        this.prefix = prefix;
        this.suffix = suffix;
    }


    @Override
    public String execute(String text) {
        if (text == null) {
            text = "";
        }
        return(prefix + text + suffix); 
    }

    public String getPrefix(){
        return prefix; 
    }

    public String getSuffix(){
        return suffix; 
    }

    
}
