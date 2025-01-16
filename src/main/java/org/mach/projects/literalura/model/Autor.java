package org.mach.projects.literalura.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Livro> livros = new ArrayList<>();

    private String birth_year;
    private String death_year;

    public Autor() {}

    public Autor(AutorData autorData) {
        this.name = autorData.name();
        this.birth_year = autorData.birth_year();
        this.death_year = autorData.death_year();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getDeath_year() {
        return death_year;
    }

    public void setDeath_year(String death_year) {
        this.death_year = death_year;
    }

    public List<Livro> getBooks() {
        return livros;
    }

    public void setBooks(List<Livro> livros) {
        this.livros = new ArrayList<>();
        livros.forEach(b -> {
            b.setAuthor(this);
            this.livros.add(b);
        });
    }

    @Override
    public String toString() {
        List<String> books = this.getBooks().stream().map(Livro::getTitle).toList();
        return "\nNome: " + name +
                "\nAno de nascimento: " + birth_year +
                "\nAno da morte: " + death_year +
                "\nObras: " + books;
    }
}
