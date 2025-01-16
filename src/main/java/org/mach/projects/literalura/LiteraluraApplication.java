package org.mach.projects.literalura;

import org.mach.projects.literalura.repository.AuthorRepository;
import org.mach.projects.literalura.repository.BookRepository;
import org.mach.projects.literalura.main.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    public void run(String... args) throws Exception {
        Main main = new Main(bookRepository, authorRepository);
        main.start();
    }

}
