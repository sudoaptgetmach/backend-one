package org.mach.src.oop.exercicios;

import java.time.Year;

public class Carro {

    private final String nome;
    private final int ano;
    private final String cor;
    private String fichatecnica;

    public Carro(String nome, int ano, String cor) {
        this.nome = nome;
        this.ano = ano;
        this.cor = cor;
    }

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

    public void setFichatecnica(String fichatecnica) {
        this.fichatecnica = fichatecnica;
    }
}
