package org.mach.projects.literalura.service;

import org.mach.projects.literalura.model.Autor;
import org.mach.projects.literalura.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Scanner;

@Service
public class AutorService {
    private final Scanner teclado = new Scanner(System.in);
    @Autowired
    private AuthorRepository authorRepository;


    public AutorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional(readOnly = true)
    public void listarAutoresCadastrados() {
        List<Autor> autores = authorRepository.findAll();
        if (!autores.isEmpty()) {
            System.out.println("\n===== Autores cadastrados =====");
            autores.forEach(System.out::println);
        } else {
            System.out.println("\nNenhum autor cadastrado.");
        }
    }

    @Transactional(readOnly = true)
    public void listarAutoresVivosEmAno() {
        System.out.println("\nDigite o ano que deseja consultar:");
        int ano = teclado.nextInt();

        List<Autor> autores = authorRepository.findAuthorsAlive(ano);
        if (!autores.isEmpty()) {
            System.out.println("\n===== Autores vivos em " + ano + " =====");
            autores.forEach(System.out::println);
        } else {
            System.out.println("\nNenhum autor encontrado para o ano selecionado.");
        }
    }
}