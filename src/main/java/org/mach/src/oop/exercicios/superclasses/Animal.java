package org.mach.src.oop.exercicios.superclasses;

public abstract class Animal {

    private String nome;
    private String tipo;
    private int idade;
    private int tamanho;
    private int expectativaVida;

    public Animal(String nome, String tipo, int idade, int tamanho, int expectativaVida, String som) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.tamanho = tamanho;
        this.expectativaVida = expectativaVida;
        this.som = som;
    }

    public String som;

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getExpectativaVida() {
        return expectativaVida;
    }

    public void setExpectativaVida(int expectativaVida) {
        this.expectativaVida = expectativaVida;
    }

    public String toString() {
        return "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nTipo: " + this.getTipo() + "\nTamanho: " + this.getTamanho() + "\nExpectativa de vida: " + this.getExpectativaVida();
    }
}