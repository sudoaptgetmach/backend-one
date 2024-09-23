package org.mach.projects.screenmatch;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algum filme no catálogo: ");
        String filme = scanner.nextLine();

        if(filme.equals("Top Gun: Maverick")) {
            System.out.println("Você acertou e ganhou o acesso grátis a esse filme!");
        } else {
            System.out.println("Não! O resultado era Top Gun: Maverick. :(");
        }

    }
}
