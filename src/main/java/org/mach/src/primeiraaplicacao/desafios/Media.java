package org.mach.src.primeiraaplicacao.desafios;

public class Media {

    public static void main(String[] args) {

        double num1 = Math.random() * 11;
        double num2 = Math.random() * 11;
        float media = (float) (num1 + num2) / 3;

        System.out.printf("Primeira nota: %.1f\n", num1);
        System.out.printf("Segunda nota: %.1f\n", num2);
        System.out.printf("Média: %.1f\n", media);


    }

}
