package no.ntnu.idatt2003;

public class WrapSelectionTextCommand extends WrapTextCommand{

    private int start; 
    private int end; 

    public WrapSelectionTextCommand(String prefix, String suffix, int start, int end) {
        super(prefix, suffix); // Bruker konstruktøren fra WrapTextCommand

        if(start<0 || start > end){
            throw new IllegalArgumentException("Start kan ikke være under 0 og kan ikke være større enn slutt");
        }
        if(end<0){
             throw new IllegalArgumentException("Slutt kan ikke være under 0 og kan ikke være større enn selve teksten");
        }

        this.start = start; 
        this.end = end; 

    }



    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Inputtekst kan ikke være null");

        }

        if (this.end > text.length()){
            throw new IllegalArgumentException("slutten kan ikke være større enn selve teksten lol"); 

        }

        String firstPart = text.substring(0, this.start); 
        String middlePart = text.substring(this.start,this.end); 
        String endPart = text.substring(this.end);

        return(firstPart + super.getPrefix() + middlePart + super.getSuffix() + endPart); 


    }
    

}






   

    

