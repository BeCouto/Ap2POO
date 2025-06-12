package model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public abstract class Eventos {
    private final LocalDate data;
    private String titulo;
    private double duracao;
    private double orcamento;
    private Local local;
    private Set<Participante> participantes;

    public Eventos(String titulo, LocalDate data, double duracao, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.orcamento = orcamento;
        this.local = local;
        this.participantes = new HashSet<Participante>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public LocalDate getData() {
        return data;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    public boolean adicionarParticipante(Participante participante) {
        this.participantes.add(participante);
        return true; // Inscrição sempre bem-sucedida, sem verificar vagas.
    }

    public void removerParticipante(Participante participante) {
        this.participantes.remove(participante);
    }
}
