package no.ntnu.idatt2003;


public class CapitalizeTextCommand implements TextCommand {

    /**
     * Denne klassen implementerer TextCommand og gjør første bokstav i en tekst
     * stor.
     *
     *  execute() opererer direkte på input. - Ingen konstruktør nødvendig da klassen ikke trenger noen
     * innstillinger. - execute() gjør alt i ett steg, så det er ingen behov for mellomlagring i objektet.
     */


    @Override
    public String execute(String text){
        if (text == null || text.isEmpty()){
            throw new IllegalArgumentException("Teksten kan ikke være tom");
        }

        String firstLetter = text.substring(0,1).toUpperCase(); 
        String restOfText = text.substring(1); 

        return(firstLetter + restOfText); 
    

}

}