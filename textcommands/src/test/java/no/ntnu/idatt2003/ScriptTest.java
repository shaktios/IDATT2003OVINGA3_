package no.ntnu.idatt2003;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ScriptTest {

    @Test
    void testExecuteMultipleCommands() {
        // Lager en liste med kommandoer som skal brukes i scriptet
        TextCommand replaceCommand = new ReplaceTextCommand("hei", "hallo");
        TextCommand capitalizeCommand = new CapitalizeTextCommand();
        TextCommand wrapCommand = new WrapTextCommand("[", "]");

        List<TextCommand> commands = Arrays.asList(replaceCommand, capitalizeCommand, wrapCommand);
        Script script = new Script(commands);

        // Kjører gjennom alle kommandoene i rekkefølge:
        // 1. "hei verden" -> "hallo verden" (ReplaceTextCommand)
        // 2. "hallo verden" -> "Hallo verden" (CapitalizeTextCommand)
        // 3. "Hallo verden" -> "[Hallo verden]" (WrapTextCommand)
        String result = script.execute("hei verden");
        assertEquals("[Hallo verden]", result);
    }

    @Test
    void testExecuteWithEmptyCommands() {
        Script script = new Script(List.of()); // Ingen kommandoer
        String result = script.execute("ingen endring");
        assertEquals("ingen endring", result); // Skal være uendret
    }

}
