package no.ntnu.idatt2003;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeWordsTextCommandTest {

    @Test
    void testCapitalizeAllWords() {
        CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
        String result = command.execute("hei jeg heter shakti ");
        assertEquals("Hei Jeg Heter Shakti", result);
    }

    @Test
    void testSingleWord() {
        CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
        String result = command.execute("java");
        assertEquals("Java", result);
    }

    @Test
    void testEmptyStringThrowsException() {
        CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
        assertThrows(IllegalArgumentException.class, () -> command.execute(""));
    }

    @Test
    void testNullThrowsException() {
        CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
        assertThrows(IllegalArgumentException.class, () -> command.execute(null));
    }

    @Test
    void testMultipleSpacesBetweenWords() {
        CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
        String result = command.execute("  hello   world  ");
        assertEquals("  Hello   World", result);
    }
    
}



