package org.mach.src.exercises.beecrowd;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id, hours;
        double hourlySalary, finalSalary;

        id = scanner.nextInt();
        hours = scanner.nextInt();
        hourlySalary = scanner.nextDouble();
        finalSalary = hourlySalary * hours;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f\n", finalSalary);


        scanner.close();
    }
}
