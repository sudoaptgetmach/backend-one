package org.mach.src.oop.exercicios.getterssetters;

import java.util.ArrayList;
import java.util.List;

public class Musica {

    public final String nome;
    public final String artista;
    public final int anoDeLancamento;
    private final List<Integer> avaliacoes = new ArrayList<>();

    public Musica(String nome, String artista, int anoDeLancamento) {
        this.nome = nome;
        this.artista = artista;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void avaliar(int novaAvaliacao) {
        this.avaliacoes.add(novaAvaliacao);
    }

    public int getNumeroAvaliacoes() {
        return avaliacoes.size();
    }

    public double getMediaAvaliacoes() {
        int soma = 0;
        for (int avaliacao : avaliacoes) {
            soma += avaliacao;
        }
        return (double) soma / avaliacoes.size();
    }
}