package model;

import java.time.LocalDate;

public class Palestra extends Eventos {
    private String palestranteNome;
    private String palestranteEmail;
    private String palestranteInstituicao;


    public Palestra(String titulo, LocalDate data, double duracao, double orcamento, Local local, String palestranteNome, String palestranteEmail, String palestranteInstituicao) {
        super(titulo, data, duracao, orcamento, local);
        this.palestranteNome = palestranteNome;
        this.palestranteEmail = palestranteEmail;
        this.palestranteInstituicao = palestranteInstituicao;
    }

    public String getPalestranteNome() {
        return palestranteNome;
    }

    public void setPalestranteNome(String palestranteNome) {
        this.palestranteNome = palestranteNome;
    }

    public String getPalestranteEmail() {
        return palestranteEmail;
    }

    public void setPalestranteEmail(String palestranteEmail) {
        this.palestranteEmail = palestranteEmail;
    }

    public String getPalestranteInstituicao() {
        return palestranteInstituicao;
    }

    public void setPalestranteInstituicao(String palestranteInstituicao) {
        this.palestranteInstituicao = palestranteInstituicao;
    }
}
