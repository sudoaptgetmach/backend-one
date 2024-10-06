package org.mach.src.primeiraaplicacao.desafios;

import java.util.Scanner;

public class Menu {

    static final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Digite uma dessas opções: ");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o lado do quadrado: ");
                    int l = scanner.nextInt();
                    int quadrado = (l * l);
                    System.out.println("A área do quadrado é: " + quadrado);
                    validInput = true;
                    break;
                case 2:
                    System.out.println("Digite o raio do círculo: ");
                    int r = scanner.nextInt();
                    double circulo = PI * (r * r);
                    System.out.printf("A área do círculo é: %.2f\n", circulo);
                    validInput = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}