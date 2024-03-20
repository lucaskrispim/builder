import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ComputadorBuilderTest {

    @Test
    public void testComputadorBuilder() {
        Computador computador = new ComputadorBuilder()
                .comProcessador("Intel i9")
                .comPlacaMae("Asus ROG Maximus")
                .comMemoriaRAM("32GB DDR4")
                .comArmazenamento("1TB SSD")
                .comPlacaVideo("NVIDIA RTX 3080")
                .construir();

        assertEquals("Intel i9", computador.getProcessador());
        assertEquals("Asus ROG Maximus", computador.getPlacaMae());
        assertEquals("32GB DDR4", computador.getMemoriaRAM());
        assertEquals("1TB SSD", computador.getArmazenamento());
        assertEquals("NVIDIA RTX 3080", computador.getPlacaVideo());
    }
}