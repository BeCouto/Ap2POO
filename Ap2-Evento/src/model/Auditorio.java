package model;

public class Auditorio extends Local {
    private Boolean sistemaSom;
    private Boolean traducao;

    public Auditorio(String nomeIdentificador, int capacidadeMaxima, String bloco, Boolean sistemaSom, Boolean traducao) {
        super(nomeIdentificador, capacidadeMaxima, bloco);
        this.sistemaSom = sistemaSom;
        this.traducao = traducao;
    }

    public Boolean getSistemaSom() {
        return sistemaSom;
    }

    public void setSistemaSom(Boolean sistemaSom) {
        this.sistemaSom = sistemaSom;
    }

    public Boolean getTraducao() {
        return traducao;
    }

    public void setTraducao(Boolean traducao) {
        this.traducao = traducao;
    }
}