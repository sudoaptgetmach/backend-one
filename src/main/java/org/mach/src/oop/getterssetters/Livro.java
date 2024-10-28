package org.mach.src.oop.getterssetters;

public class Livro {

    private String titulo;
    private String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    void exibirDetalhes() {

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);

    }

}
