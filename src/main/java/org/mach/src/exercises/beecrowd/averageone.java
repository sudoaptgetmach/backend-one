package org.mach.src.exercises.beecrowd;

import java.util.Scanner;

public class averageone {

    public static void main(String[] args) {
        float a, b;
        double ans;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextFloat();
        b = scanner.nextFloat();

        ans = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f\n", ans);

    }
}
