package model;

import java.time.LocalDate;

public class Seminario extends Eventos {
   private String tema;
   private String alunoPalestrante;
   private String orientador;

    public Seminario(String titulo, LocalDate data, double duracao, double orcamento, Local local, String tema, String alunoPalestrante, String orientador) {
        super(titulo, data, duracao, orcamento, local);
        this.tema = tema;
        this.alunoPalestrante = alunoPalestrante;
        this.orientador = orientador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAlunoPalestrante() {
        return alunoPalestrante;
    }

    public void setAlunoPalestrante(String alunoPalestrante) {
        this.alunoPalestrante = alunoPalestrante;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }
}
