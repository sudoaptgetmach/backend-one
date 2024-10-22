package org.mach.src.oop.exercicios.getterssetters;

public class Produto {

    private String nome;
    private double preco;
    private double precoFinal;
    private int desconto;

    void aplicarDesconto(int desconto) {

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
        }
        return precoFinal;
    }

    public int getDesconto() {
        return desconto;
    }
}
