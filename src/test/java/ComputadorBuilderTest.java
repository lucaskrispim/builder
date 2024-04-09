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
                .build();

        assertEquals("Intel i9", computador.getProcessador());
        assertEquals("Asus ROG Maximus", computador.getPlacaMae());
        assertEquals("32GB DDR4", computador.getMemoriaRAM());
        assertEquals("1TB SSD", computador.getArmazenamento());
        assertEquals("NVIDIA RTX 3080", computador.getPlacaVideo());
    }

    @Test
    void testBuildThrowsExceptionOnMissingMotherBoard() {

        Exception exceptionPlacaMae = assertThrows(IllegalArgumentException.class, () -> {
            new ComputadorBuilder().comProcessador("Intel Core i7").comMemoriaRAM("16GB").build();
        });
        assertTrue(exceptionPlacaMae.getMessage().contains("Placa Mãe inválida"));
    }

    @Test
    void testBuildThrowsExceptionOnMissingProcessor() {

        Exception exceptionPlacaMae = assertThrows(IllegalArgumentException.class, () -> {
            new ComputadorBuilder().comPlacaMae("Asus ROG Maximus").comMemoriaRAM("16GB").build();
        });
        assertTrue(exceptionPlacaMae.getMessage().contains("Processador inválido"));
    }

    @Test
    void testBuildThrowsExceptionOnMissingRAM() {

        Exception exceptionPlacaMae = assertThrows(IllegalArgumentException.class, () -> {
            new ComputadorBuilder().comPlacaMae("Asus ROG Maximus").comProcessador("Intel Core i7").build();
        });
        assertTrue(exceptionPlacaMae.getMessage().contains("Memória RAM inválida"));
    }
}