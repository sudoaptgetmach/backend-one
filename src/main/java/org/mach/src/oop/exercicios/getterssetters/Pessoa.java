package org.mach.src.oop.exercicios.getterssetters;

import java.util.ArrayList;

public class Pessoa {

    private final String nome;
    private final int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getFrase() {
        return "Olá, mundo.";
    }

    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\n";
    }

    public void run() {



    }
}
