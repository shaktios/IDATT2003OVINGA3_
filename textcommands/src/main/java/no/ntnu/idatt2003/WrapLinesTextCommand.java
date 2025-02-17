package no.ntnu.idatt2003;

public class WrapLinesTextCommand extends WrapTextCommand{


    public WrapLinesTextCommand(String prefix, String suffix) {
        super(prefix, suffix); // Bruker konstruktøren fra ReplaceTextCommand
    }


    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Inputtekst kan ikke være null");
        }
        String [] lines = text.split("\n");
        
        for (int i = 0; i < lines.length; i++) {
            lines[i] = super.execute(lines[i]); 
        }

        return String.join("\n", lines); 
    }

    

    
}
