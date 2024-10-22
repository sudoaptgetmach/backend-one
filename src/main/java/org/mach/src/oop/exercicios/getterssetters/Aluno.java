package org.mach.src.oop.exercicios.getterssetters;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private final List<Double> notas = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addNota(double nota) {
        this.notas.add(nota);
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return !notas.isEmpty() ? soma / notas.size() : 0;
    }
}