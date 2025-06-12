package model;

public class Laboratorio extends Local {
    private int numerocomputadores;
    private String laboratorio; //quimica ou informatica

    public Laboratorio(String nomeIdentificador, int capacidadeMaxima, String bloco, int numerocomputadores, String laboratorio) {
        super(nomeIdentificador, capacidadeMaxima, bloco);
        this.numerocomputadores = numerocomputadores;
        this.laboratorio = laboratorio;
    }

    public int getNumerocomputadores() {
        return numerocomputadores;
    }

    public void setNumerocomputadores(int numerocomputadores) {
        this.numerocomputadores = numerocomputadores;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
}
