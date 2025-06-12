package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MiniCurso extends Eventos {
    private List<Instrutor> instrutores;
    private int cargaHoraria;
    private List<String> materialApoio;

    public MiniCurso(String titulo, LocalDate data, double duracao, double orcamento, Local local, int cargaHoraria) {
        super(titulo, data, duracao, orcamento, local);
        this.cargaHoraria = cargaHoraria;
        this.instrutores = new ArrayList<>();
        this.materialApoio = new ArrayList<>();
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<String> getMaterialApoio() {
        return materialApoio;
    }

    public void setMaterialApoio(List<String> materialApoio) {
        this.materialApoio = materialApoio;
    }

    // Métodos para adicionar instrutores e materiais
    public void adicionarInstrutor(Instrutor instrutor) {
        this.instrutores.add(instrutor);
    }

    public void adicionarMaterial(String material) {
        this.materialApoio.add(material);
    }
}
