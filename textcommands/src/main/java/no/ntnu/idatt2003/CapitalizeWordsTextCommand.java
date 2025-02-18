package no.ntnu.idatt2003;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{



    @Override
    public String execute(String text){
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Teksten kan ikke være null eller tom");
        }

        String[] words = text.split(" "); 

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {  // Sjekker at vi ikke prøver å kapitalisere en tom streng, bruker den metoden vi lagde forrige deloppgave
                words[i] = super.execute(words[i]);
            } 
        }
        
        String result = String.join(" ", words); 
       
        return result; 
    }
    
}
