package org.mach.src.oop.getterssetters;

public class IdadePessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {

        if(idade <= 0) {
            idade = Math.abs(idade);
        }

        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificarIdade() {

        boolean verificarIdade;

        verificarIdade = idade >= 18;

        return verificarIdade ? "Sim." : "Não.";

    }
}
