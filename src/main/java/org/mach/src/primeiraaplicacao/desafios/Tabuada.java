package org.mach.src.primeiraaplicacao.desafios;

import java.util.Scanner;

public class Tabuada {

    static int QUANTIDADE_MAX_TABUADA = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e eu te direi a tabuada desse número de 1 a " + QUANTIDADE_MAX_TABUADA +  ": ");
        int input = scanner.nextInt();

        for (int i = 1; i <= QUANTIDADE_MAX_TABUADA; i++) {

            System.out.println(input + " x " + i + " = " + (input * i));

        }

        scanner.close();

    }

}
