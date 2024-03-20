public class Main {
    public static void main(String[] args) {
        Computador computador = new ComputadorBuilder()
                .comProcessador("Intel i9")
                .comPlacaMae("Asus ROG Maximus")
                .comMemoriaRAM("32GB DDR4")
                .comArmazenamento("1TB SSD")
                .comPlacaVideo("NVIDIA RTX 3080")
                .construir();

        System.out.println(computador);
    }
}
