package no.ntnu.idatt2003;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ReplaceFirstTextCommandTest {

    @Test
    void testReplaceOnlyFirstOccurrence() {
        ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
        String result = command.execute("Tekst med target og target");
        assertEquals("Tekst med replacement og target", result);
    }

    @Test
    void testNoOccurrences() {
        ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
        String result = command.execute("Denne teksten vil ikke ha noen endring");
        assertEquals("Denne teksten vil ikke ha noen endring", result); // Ingen endring skal skje
    }

    @Test
    void testNullInputThrowsException() {
        ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("test", "check");
        assertThrows(IllegalArgumentException.class, () -> command.execute(null));
    }

}
