package org.poo.projeto.usuario;

public class Identificacao {
    private String funcao;
    private String matricula;

    public Identificacao(String funcao, String matricula){
        this.funcao = funcao;
        this.matricula = matricula;
    }


    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
