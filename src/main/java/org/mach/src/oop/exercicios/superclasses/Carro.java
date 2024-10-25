package org.mach.src.oop.exercicios.superclasses;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;

public class Carro {

    private String nome;
    private int ano;
    private String cor;
    private String fichatecnica;
    ArrayList<Integer> precos = new ArrayList<>();

    private int preco;
    private double precoMedio;
    private int somaPrecos;
    private int menorPreco;
    private int maiorPreco;

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public int getIdade() {

        int year = Year.now().getValue();

        return (year - ano);
    }

    public String getFichatecnica() {
        return fichatecnica;
    }

    public void getPrecos() {
        for (int i = 0; i < precos.size(); i++) {
            System.out.println("Ano " + (i + 1) + ": R$" + precos.get(i));
        }
    }

    public int getPreco() {
        return preco;
    }


    public int getSomaPrecos() {
        somaPrecos = 0;
        for (int preco : precos) {
            somaPrecos += preco;
        }
        return somaPrecos;
    }

    public double getPrecoMedio() {
        int somaPrecos = 0; // Variável local
        for (int preco : precos) {
            somaPrecos += preco;
        }
        precoMedio = somaPrecos / precos.size();
        return precoMedio;
    }

    public int getMenorPreco() {
        menorPreco = Collections.min(precos);
        return menorPreco;
    }

    public int getMaiorPreco() {
        maiorPreco = Collections.max(precos);
        return maiorPreco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void addPrecos(int precos) {
        this.precos.add(precos);
    }

    public void setFichatecnica(String fichatecnica) {
        this.fichatecnica = fichatecnica;
    }
}
