package org.mach.src.primeiraaplicacao.desafios;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e eu direi se esse número é Par ou Impar: ");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("O número " + input + " é par.");
        } else {
            System.out.println("O número " + input + " é impar.");
        }

        scanner.close();
    }
}
