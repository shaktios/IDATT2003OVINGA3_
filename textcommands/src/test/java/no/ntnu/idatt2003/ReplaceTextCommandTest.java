package no.ntnu.idatt2003;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ReplaceTextCommandTest {

    @Test
    void testReplaceAllOccurrences() {
        ReplaceTextCommand command = new ReplaceTextCommand("world", "Java");
        String result = command.execute("Hello world, world!");
        assertEquals("Hello Java, Java!", result);
    }

    @Test
    void testReplaceWithNoOccurrences() {
        ReplaceTextCommand command = new ReplaceTextCommand("Vaalerenga", "Lillestroem");
        String result = command.execute("Jeg elsker Arsenal");
        assertEquals("Jeg elsker Arsenal", result);
    }

    @Test
    void testNullInputThrowsException() {
        ReplaceTextCommand command = new ReplaceTextCommand("test", "check");
        assertThrows(IllegalArgumentException.class, () -> command.execute(null));
    }
}
