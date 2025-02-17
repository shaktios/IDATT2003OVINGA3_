package no.ntnu.idatt2003;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class WrapSelectionTextCommandTest {

    @Test
    void testWrapValidSelection() {
        WrapSelectionTextCommand command = new WrapSelectionTextCommand("**", "**", 6, 11);
        String result = command.execute("Hello world");
        assertEquals("Hello **world**", result);
    }

    @Test
    void testWrapFullString() {
        WrapSelectionTextCommand command = new WrapSelectionTextCommand("[", "]", 0, 11);
        String result = command.execute("Hello world");
        assertEquals("[Hello world]", result);
    }

    @Test
    void testInvalidEndThrowsException() {
        WrapSelectionTextCommand command = new WrapSelectionTextCommand("<<", ">>", 3, 15);
        assertThrows(IllegalArgumentException.class, () -> command.execute("Hello world"));
    }
    
}
