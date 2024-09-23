package org.mach.src.primeiraaplicacao.desafios;

public class CastingDoubleToInt {

    public static void main(String[] args) {

        double variavel = Math.random() * 6;
        int doubleToInt = (int) variavel;

        System.out.println("Variável double: " + variavel);
        System.out.println("Variável após casting: " + doubleToInt);

    }
}
