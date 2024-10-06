package org.mach.projects.screenmatch;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tentativas = 3;
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < tentativas; i++) {

            System.out.println("Digite sua avaliação para o filme: ");
            nota = scanner.nextDouble();
            mediaAvaliacao += nota;

        }

        System.out.printf("Média de avaliações: %.2f", (mediaAvaliacao / tentativas));

    }
}
