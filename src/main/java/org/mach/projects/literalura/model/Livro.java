package org.mach.projects.literalura.model;

import java.util.ArrayList;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Autor author;

    @ElementCollection
    @CollectionTable(name = "book_languages", joinColumns = @JoinColumn(name = "book_id"))
    @Column(name = "language")
    private List<String> languages = new ArrayList<>();

    private int downloads;

    public Livro() { }

    public Livro(LivroData bookData) {
        this.title = bookData.title();
        this.languages = bookData.languages();
        this.downloads = bookData.downloads();
        this.author = new Autor(bookData.author().getFirst());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Autor getAuthor() {
        return author;
    }

    public void setAuthor(Autor author) {
        this.author = author;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + title +
                "\nAutor: " + author.getName() +
                "\nLinguagens disponíveis: " + languages +
                "\nTotal de downloads: " + downloads;
    }
}