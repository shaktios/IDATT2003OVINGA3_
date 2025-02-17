package no.ntnu.idatt2003;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WrapTextCommandTest {

    @Test
    void testWrapText() {
        WrapTextCommand command = new WrapTextCommand("**", "**");
        String result = command.execute("Hei");
        assertEquals("**Hei**", result);
    }

    @Test
    void testEmptyText() {
        WrapTextCommand command = new WrapTextCommand("<<", ">>");
        String result = command.execute("");
        assertEquals("<<>>", result); // Skal bare returnere prefix + suffix
    }

    @Test
    void testNullText() {
        WrapTextCommand command = new WrapTextCommand("[", "]");
        String result = command.execute(null);
        assertEquals("[]", result); // Null skal behandles som tom streng
    }


    
}
