import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputadorTest {

    @Test
    public void testSettersAndGetters() {
        Computador computador = new Computador();
        computador.setProcessador("Intel i9");
        computador.setPlacaMae("Asus ROG Maximus");
        computador.setMemoriaRAM("32GB DDR4");
        computador.setArmazenamento("1TB SSD");
        computador.setPlacaVideo("NVIDIA RTX 3080");

        assertEquals("Intel i9", computador.getProcessador());
        assertEquals("Asus ROG Maximus", computador.getPlacaMae());
        assertEquals("32GB DDR4", computador.getMemoriaRAM());
        assertEquals("1TB SSD", computador.getArmazenamento());
        assertEquals("NVIDIA RTX 3080", computador.getPlacaVideo());
    }

}