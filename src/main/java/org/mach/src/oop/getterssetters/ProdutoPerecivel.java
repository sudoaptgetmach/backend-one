package org.mach.src.oop.getterssetters;

import org.mach.src.oop.superclasses.Produto;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

    public Date dataValidade;

    public ProdutoPerecivel(String nome, double preco, Date dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.getNome() + "\nPreco original: " + String.format("%.2f",this.getPreco()) + "\nDesconto aplicado: " + this.getDesconto() + "\nPreço final: " + String.format("%.2f", this.getPrecoFinal()) + "\nData de validade: " + getDataValidade();
    }
}
