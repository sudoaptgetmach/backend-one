package org.mach.src.exercises.beecrowd;

import java.util.Scanner;

public class salarybonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary, totalSold;
        String nome;

        nome = scanner.nextLine();
        salary = scanner.nextFloat();
        totalSold = scanner.nextFloat();

        System.out.printf("TOTAL = R$ %.2f\n", ((totalSold * 15) / 100) + salary);

    }
}
