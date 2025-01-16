package org.mach.projects.literalura;

import org.mach.projects.literalura.main.Main;
import org.mach.projects.literalura.service.AutorService;
import org.mach.projects.literalura.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

    @Autowired
    private LivroService livroService;
    @Autowired
    private AutorService autorService;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Main main = new Main(livroService, autorService);
        main.start();
    }
}