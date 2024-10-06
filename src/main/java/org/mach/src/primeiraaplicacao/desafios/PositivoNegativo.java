package org.mach.src.primeiraaplicacao.desafios;

import java.util.Scanner;

public class PositivoNegativo {


    public static void main(String[] args) {

        final int NUMERO_DE_TENTATIVAS = 5;
        Scanner scanner = new Scanner(System.in);

        for (int tentativa = 0; tentativa < NUMERO_DE_TENTATIVAS; tentativa++) {

            System.out.println("Digite um número e eu direi se ele é negativo ou positivo.");
            int resposta = scanner.nextInt();

            if (resposta < 0) {
                System.out.println("O número " + resposta + " é negativo.");
            } else {
                System.out.println("O número " + resposta + " é positivo.");
            }

        }

        scanner.close();
    }

}
