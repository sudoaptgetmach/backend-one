package org.mach.src.exercises.beecrowd;

import java.util.Scanner;

public class simpleproduct {

    public static void main(String[] args) {

        int a, b, ans;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        ans = a * b;

        System.out.println("PROD = " + ans + "\n");

    }
}
