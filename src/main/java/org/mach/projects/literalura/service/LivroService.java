package org.mach.projects.literalura.service;

import org.springframework.transaction.annotation.Transactional;
import org.mach.projects.literalura.model.*;
import org.mach.projects.literalura.repository.BookRepository;
import org.mach.projects.literalura.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class LivroService {
    private final Scanner teclado = new Scanner(System.in);
    private final ApiService apiService;
    private final JsonConverter jsonConverter;
    @Autowired
    private BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public LivroService(ApiService apiService, JsonConverter jsonConverter, BookRepository bookRepository, AuthorRepository authorRepository) {
        this.apiService = apiService;
        this.jsonConverter = jsonConverter;
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Transactional
    public void buscarLivroPorTitulo() {
        final String BASE_URL = "https://gutendex.com/books/?search=";
        System.out.println("\nDigite o nome do livro que deseja buscar:");
        String titulo = teclado.nextLine();

        if (!titulo.isBlank() && !isNumero(titulo)) {
            String json = apiService.getData(BASE_URL + titulo.replace(" ", "%20"));
            Results data = jsonConverter.obtainData(json, Results.class);
            Optional<LivroData> livroEncontrado = data.results()
                    .stream()
                    .filter(b -> b.title().toLowerCase().contains(titulo.toLowerCase()))
                    .findFirst();

            if (livroEncontrado.isPresent()) {
                LivroData LivroData = livroEncontrado.get();
                if (!verificarExistenciaLivro(LivroData)) {
                    salvarLivroEAutor(LivroData);
                } else {
                    System.out.println("\nLivro já cadastrado no banco de dados.");
                }
            } else {
                System.out.println("\nLivro não encontrado.");
            }
        } else {
            System.out.println("\nEntrada inválida.");
        }
    }

    private void salvarLivroEAutor(LivroData LivroData) {
        Livro livro = new Livro(LivroData);
        AutorData autorData = LivroData.author().getFirst();
        Optional<Autor> autorExistente = authorRepository.findByName(autorData.name());

        if (autorExistente.isPresent()) {
            Autor autor = autorExistente.get();
            livro.setAuthor(autor);
            autor.getBooks().add(livro);
            authorRepository.save(autor);
        } else {
            Autor novoAutor = new Autor(autorData);
            livro.setAuthor(novoAutor);
            novoAutor.getBooks().add(livro);
            authorRepository.save(novoAutor);
        }

        bookRepository.save(livro);
    }

    public void listarLivrosCadastrados() {
        List<Livro> livros = bookRepository.findAll();
        if (!livros.isEmpty()) {
            System.out.println("\n===== Livros cadastrados =====");
            livros.forEach(System.out::println);
        } else {
            System.out.println("\nNenhum livro cadastrado.");
        }
    }

    public void listarTop10Livros() {
        List<Livro> livros = bookRepository.findTop10();
        if (!livros.isEmpty()) {
            System.out.println("\n===== Top 10 livros mais baixados =====");
            livros.forEach(l -> System.out.println(l.getTitle()));
        } else {
            System.out.println("\nNenhum livro cadastrado.");
        }
    }

    @Transactional(readOnly = true)
    public void listarLivrosPorIdioma() {
        System.out.println("\nSelecione o idioma que deseja consultar:");
        String menuIdiomas = """
               \n
               1 - Inglês
               2 - Francês
               3 - Alemão
               4 - Português
               5 - Espanhol
               """;
        System.out.println(menuIdiomas);

        if (teclado.hasNextInt()) {
            int opcao = teclado.nextInt();
            String idioma = switch (opcao) {
                case 1 -> "en";
                case 2 -> "fr";
                case 3 -> "de";
                case 4 -> "pt";
                case 5 -> "es";
                default -> {
                    System.out.println("\nOpção inválida.");
                    yield "";
                }
            };

            if (!idioma.isEmpty()) {
                List<Livro> livros = bookRepository.findBooksByLanguage(idioma);
                if (!livros.isEmpty()) {
                    System.out.println("\nLivros cadastrados:");
                    livros.forEach(livro -> System.out.println(livro.toString()));
                } else {
                    System.out.println("\nNenhum livro encontrado para o idioma selecionado.");
                }
            }
        } else {
            System.out.println("\nEntrada inválida.");
            teclado.next();
        }
    }

    public void mostrarEstatisticasBanco() {
        List<Livro> livros = bookRepository.findAll();
        if (!livros.isEmpty()) {
            IntSummaryStatistics stats = livros.stream()
                    .filter(l -> l.getDownloads() > 0)
                    .collect(Collectors.summarizingInt(Livro::getDownloads));

            System.out.println("\n===== Estatísticas do banco de dados =====");
            System.out.println("Downloads médios: " + stats.getAverage());
            System.out.println("Máximo de downloads: " + stats.getMax());
            System.out.println("Mínimo de downloads: " + stats.getMin());
            System.out.println("Total de livros cadastrados: " + stats.getCount());
        } else {
            System.out.println("\nNenhum livro cadastrado.");
        }
    }

    private boolean verificarExistenciaLivro(LivroData LivroData) {
        return bookRepository.verifiedBDExistence(LivroData.title());
    }

    private boolean isNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}