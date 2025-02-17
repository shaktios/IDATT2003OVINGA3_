package no.ntnu.idatt2003;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class WrapLinesTextCommandTest {
    @Test
    void testWrapMultipleLines() {
        WrapLinesTextCommand command = new WrapLinesTextCommand(">>", "<<");
        String result = command.execute("Hello\nWorld");
        assertEquals(">>Hello<<\n>>World<<", result);
    }

    @Test
    void testWrapSingleLine() {
        WrapLinesTextCommand command = new WrapLinesTextCommand("[", "]");
        String result = command.execute("SingleLine");
        assertEquals("[SingleLine]", result);
    }

    @Test
    void testNullInputThrowsException() {
        WrapLinesTextCommand command = new WrapLinesTextCommand("<<", ">>");
        assertThrows(IllegalArgumentException.class, () -> command.execute(null));
    }
}
