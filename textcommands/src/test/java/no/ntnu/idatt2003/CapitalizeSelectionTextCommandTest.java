package no.ntnu.idatt2003;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CapitalizeSelectionTextCommandTest {


    @Test
    void testCapitalizeSelection() {
        CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("selection");
        String result = command.execute("tekst med en selection og en annen selection");
        assertEquals("tekst med en Selection og en annen Selection", result);
    }

    @Test
    void testNoOccurrences() {
        CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("ingenting");
        String result = command.execute("tekst med en selection og en annen selection");
        assertEquals("tekst med en selection og en annen selection", result); // Skal være uendret
    }

    @Test
    void testCaseSensitivity() {
        CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("Selection");
        String result = command.execute("tekst med en selection og en annen selection");
        assertEquals("tekst med en selection og en annen selection", result); // Skal være uendret siden "Selection" != "selection"
    }

    @Test
    void testEmptyStringThrowsException() {
        CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("selection");
        assertThrows(IllegalArgumentException.class, () -> command.execute(""));
    }

    @Test
    void testNullInputThrowsException() {
        CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("selection");
        assertThrows(IllegalArgumentException.class, () -> command.execute(null));
    }
    
}
