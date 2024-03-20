class Computador {
    private String processador;
    private String placaMae;
    private String memoriaRAM;

    public String getProcessador() {
        return processador;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    private String armazenamento;
    private String placaVideo;

    // Métodos setters para cada atributo
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", placaMae='" + placaMae + '\'' +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                ", placaVideo='" + placaVideo + '\'' +
                '}';
    }
}