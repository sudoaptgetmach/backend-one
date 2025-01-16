package org.mach.projects.literalura.main;

import org.mach.projects.literalura.service.*;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Main {
    private final Scanner teclado = new Scanner(System.in);
    private final LivroService livroService;
    private final AutorService autorService;

    public Main(LivroService livroService, AutorService autorService) {
        this.livroService = livroService;
        this.autorService = autorService;
    }

    public void start() {
        int opcao;
        do {
            exibirMenu();
            opcao = obterOpcaoUsuario();
            tratarOpcaoUsuario(opcao);
        } while (opcao != 0);
    }

    private void exibirMenu() {
        String menu = """

                1 - Buscar livro por título
                2 - Listar livros cadastrados
                3 - Listar autores cadastrados
                4 - Listar autores vivos em um determinado ano
                5 - Listar livros por idioma
                6 - Listar os 10 livros mais baixados
                7 - Mostrar estatísticas do banco de dados
                
                0 - Sair
                """;
        System.out.println(menu);
    }

    private int obterOpcaoUsuario() {
        if (teclado.hasNextInt()) {
            int opcao = teclado.nextInt();
            teclado.nextLine();
            return opcao;
        } else {
            System.out.println("\nEntrada inválida. Por favor, insira um número.");
            teclado.next();
            return -1;
        }
    }

    private void tratarOpcaoUsuario(int opcao) {
        switch (opcao) {
            case 1 -> livroService.buscarLivroPorTitulo();
            case 2 -> livroService.listarLivrosCadastrados();
            case 3 -> autorService.listarAutoresCadastrados();
            case 4 -> autorService.listarAutoresVivosEmAno();
            case 5 -> livroService.listarLivrosPorIdioma();
            case 6 -> livroService.listarTop10Livros();
            case 7 -> livroService.mostrarEstatisticasBanco();
            case 0 -> System.out.println("\nFechando o aplicativo...");
            default -> System.out.println("\nOpção inválida. Tente novamente.");
        }
    }
}