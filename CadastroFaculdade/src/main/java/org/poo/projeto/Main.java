package org.poo.projeto;
import org.poo.projeto.usuario.Identificacao;
import org.poo.projeto.usuario.Pessoa;


public class Main {
    public static void main(String[] args) {
        Identificacao i = new Identificacao(
                "Professor",
                "1100394");

        Pessoa p = new Pessoa(
                "Caio",
                "0320320323",
                2002,
                i
        );

        System.out.println("Nome: " + p.getNome());
        System.out.println("CPF: " + p.getCPF());
        System.out.println("Ano de Nascimento: " + p.getAnoIdade());
        System.out.println("Bem vindo ao sistema, " + p.getIdentificacao().getFuncao() + ", seu número de matrícula é: " + p.getIdentificacao().getMatricula());

    }
}