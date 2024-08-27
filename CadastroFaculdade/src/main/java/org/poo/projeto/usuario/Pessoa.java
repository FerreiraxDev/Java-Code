package org.poo.projeto.usuario;

public class Pessoa {
    private String nome;
    private String CPF;
    private int anoIdade;
    private Identificacao identificacao;

    public Pessoa(String nome, String CPF, int anoIdade, Identificacao identificacao){
        this.nome = nome;
        this.CPF = CPF;
        this.anoIdade = anoIdade;
        this.setIdentificacao(identificacao);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getAnoIdade() {
        return anoIdade;
    }

    public void setAnoIdade(int anoIdade) {
        this.anoIdade = anoIdade;
    }


    public Identificacao getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Identificacao identificacao) {
        this.identificacao = identificacao;
    }
}
