package org.mach.src.exercises.beecrowd;

import java.util.Scanner;

public class circle {

    public static void main(String[] args) {
        
        double r;
        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();
        
        double circle = pi * r*r;

        System.out.printf("A=%.4f\n", circle);

    }

}
