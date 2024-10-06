package org.mach.src.primeiraaplicacao.desafios;

import java.util.Scanner;

public class ComparacaoNumeros {

    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if (num2 > num1) {
            System.out.println("O número " + num2 + " é maior que o número " + num1 + ".");
        } else if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que o número " + num2 + ".");
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    }
}
