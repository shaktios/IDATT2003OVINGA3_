package no.ntnu.idatt2003;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{

    private String selection;

    public CapitalizeSelectionTextCommand(String selection){
        if(selection == null || selection.isEmpty()){
            throw new IllegalArgumentException("Selectionen kan ikke være tom"); 
        }

        this.selection = selection; 
    }


    @Override

    public String execute(String text){
        if(text == null || text.isEmpty()){
            throw new IllegalArgumentException("Teksten kan ikke være tom eller NULL"); 
        }
    
        return text.replaceAll(selection, super.execute(selection)); 

    }


    public String getSelection(){
        return this.selection; 
    }
    
}
