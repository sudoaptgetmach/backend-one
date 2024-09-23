package org.mach.src.primeiraaplicacao.desafios;

public class Temperatura {

    public static void main(String[] args) {
        double temperatura;
        temperatura = Math.random() * 100;

        float conversor = (float) ((temperatura * 1.8) + 32);

        System.out.printf("Temperatura em Celsius: %.1f\n", (float) temperatura);
        System.out.printf("Temperatura em Fahrenheit: %.1f\n", conversor);

    }

}
