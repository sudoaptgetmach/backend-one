package org.mach.src.primeiraaplicacao.desafios;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para receber o fatorial: ");
        int input = scanner.nextInt();

        int fatorial = 1;
        for (int i = input; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + input + " é: " + fatorial);

        scanner.close();
    }
}