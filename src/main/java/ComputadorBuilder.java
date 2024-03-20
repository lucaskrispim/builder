class ComputadorBuilder {
    private Computador computador;

    public ComputadorBuilder() {
        computador = new Computador();
    }

    public ComputadorBuilder comProcessador(String processador) {
        computador.setProcessador(processador);
        return this;
    }

    public ComputadorBuilder comPlacaMae(String placaMae) {
        computador.setPlacaMae(placaMae);
        return this;
    }

    public ComputadorBuilder comMemoriaRAM(String memoriaRAM) {
        computador.setMemoriaRAM(memoriaRAM);
        return this;
    }

    public ComputadorBuilder comArmazenamento(String armazenamento) {
        computador.setArmazenamento(armazenamento);
        return this;
    }

    public ComputadorBuilder comPlacaVideo(String placaVideo) {
        computador.setPlacaVideo(placaVideo);
        return this;
    }

    public Computador construir() {
        return computador;
    }
}