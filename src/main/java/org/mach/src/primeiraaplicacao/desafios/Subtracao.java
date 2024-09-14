package org.mach.src.primeiraaplicacao.desafios;

import java.util.Scanner;

public class Subtracao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextInt();
        scanner.nextLine();
        var b = scanner.nextInt();

        int resultado = a - b;

        System.out.println("O resultado de " + a + " menos " + b + " é igual a " + resultado + ".");

    }

}
