package org.poo.projeto;

public class Main {
    public static void main(String[] args) {
        String[] pessoas = new String[]{
                "Caio", "Maria", "Lorena", "Cecilia"
        };

        for (int contarNome = 0; contarNome < pessoas.length; contarNome++){
            System.out.println(pessoas[contarNome]);
        }
    }
}