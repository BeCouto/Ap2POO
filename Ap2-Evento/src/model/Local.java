package model;

public abstract class Local {
    protected String nomeIdentificador;
    protected int capacidadeMaxima;
    protected String bloco;

    public Local(String nomeIdentificador, int capacidadeMaxima, String bloco) {
        this.nomeIdentificador = nomeIdentificador;
        this.capacidadeMaxima = capacidadeMaxima;
        this.bloco = bloco;
    }

    public String getNomeIdentificador() {
        return nomeIdentificador;
    }

    public void setNomeIdentificador(String nomeIdentificador) {
        this.nomeIdentificador = nomeIdentificador;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
}