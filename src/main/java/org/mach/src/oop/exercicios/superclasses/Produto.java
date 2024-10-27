package org.mach.src.oop.exercicios.superclasses;

public class Produto {

    private String nome;
    private double preco;
    private double precoFinal;
    private int desconto;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(int desconto) {

        if (desconto > 100) {
            System.out.println("O desconto não pode ser maior que 100%");
        } else {
            this.desconto = desconto;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPrecoFinal() {
        if (desconto > 0) {
            return preco - (preco * desconto / 100);
        } else if (desconto == 0) {
            return preco;
        }
        return precoFinal;
    }

    public int getDesconto() {
        return desconto;
    }

    public String toString() {
        return "\nNome: " + this.getNome() + "\nPreco original: " + String.format("%.2f",this.getPreco()) + "\nDesconto aplicado: " + this.getDesconto() + "\nPreço final: " + String.format("%.2f", this.getPrecoFinal());
    }
}
