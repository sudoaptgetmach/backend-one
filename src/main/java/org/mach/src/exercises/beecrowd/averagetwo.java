package org.mach.src.exercises.beecrowd;

import java.util.Scanner;

public class averagetwo {

    public static void main(String[] args) {

        double a, b, c, ans;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        ans = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f\n", ans);

    }

}
