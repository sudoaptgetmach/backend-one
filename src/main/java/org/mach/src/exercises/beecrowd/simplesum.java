package org.mach.src.exercises.beecrowd;

import java.util.Scanner;

public class simplesum {

    public static void main(String[] args) {
        int a, b, soma;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        soma = a + b;
        System.out.printf("SOMA = " + soma +"\n");


    }
}
