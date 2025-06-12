package model;

public class Organizador extends PessoaResponsavel {
    private String funcAdministrativa;

    public Organizador(String nome, String email, String funcAdministrativa) {
        super(nome, email);
        this.funcAdministrativa = funcAdministrativa;
    }

    public String getFuncAdministrativa() {
        return funcAdministrativa;
    }

    public void setFuncAdministrativa(String funcAdministrativa) {
        this.funcAdministrativa = funcAdministrativa;
    }
}
