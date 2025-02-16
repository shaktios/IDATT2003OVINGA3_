package no.ntnu.idatt2003;


public class ReplaceFirstTextCommand extends ReplaceTextCommand {


    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement); // Bruker konstruktøren fra ReplaceTextCommand
    }


    @Override
    public String execute(String text){
        if (text == null) {
            throw new IllegalArgumentException("Inputtekst kan ikke være null");
        }
        return text.replaceFirst(target,replacement); 
    }




}
