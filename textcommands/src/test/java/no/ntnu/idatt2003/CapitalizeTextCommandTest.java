package no.ntnu.idatt2003;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CapitalizeTextCommandTest {

    @Test
    void testCapitalizeFirstLetter() {
        CapitalizeTextCommand command = new CapitalizeTextCommand();
        String result = command.execute("hello world");
        assertEquals("Hello world", result);
    }

    @Test
    void testSingleCharacter() {
        CapitalizeTextCommand command = new CapitalizeTextCommand();
        String result = command.execute("a");
        assertEquals("A", result);
    }

    @Test
    void testEmptyStringThrowsException() {
        CapitalizeTextCommand command = new CapitalizeTextCommand();
        assertThrows(IllegalArgumentException.class, () -> command.execute(""));
    }

    @Test
    void testNullThrowsException() {
        CapitalizeTextCommand command = new CapitalizeTextCommand();
        assertThrows(IllegalArgumentException.class, () -> command.execute(null));
    }
    
}
