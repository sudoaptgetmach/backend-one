package org.mach.src.exercises.beecrowd;

import java.util.Scanner;

public class difference {

    public static void main(String[] args) {
        int A, B, C, D;
        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);

        scanner.close();
    }
}
