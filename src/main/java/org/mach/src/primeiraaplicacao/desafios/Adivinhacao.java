package org.mach.src.primeiraaplicacao.desafios;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {

        final int NUMERO_DE_TENTATIVAS = 5;
        int tentativa;

        int num = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);

        for (tentativa = 0; tentativa < NUMERO_DE_TENTATIVAS; tentativa++) {

            System.out.println("Adivinhe um número de 1 a 100: ");
            int resposta = scanner.nextInt();

            if (resposta == num) {
                System.out.println("Você acertou! O número secreto era " + num + ".");
                break;
            }
        }

        System.out.println("As tentativas acabaram! O número secreto era " + num + ".");

    }
}
