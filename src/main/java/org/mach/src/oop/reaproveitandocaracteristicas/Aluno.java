package org.mach.src.oop.reaproveitandocaracteristicas;

public class Aluno {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade + " anos.";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
