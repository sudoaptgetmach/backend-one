package org.mach.src.primeiraaplicacao.desafios;

public class ConversorDolar {

    private static final int QUANTIDADE_MAX = 100000;
    private static final double VALOR_DOLAR = 4.94;

    public static void main(String[] args) {

        double valorEmDolares = Math.random() * QUANTIDADE_MAX;
        double valorEmReais = valorEmDolares * VALOR_DOLAR;

        System.out.printf("Valor em dólares: %.2f\n", valorEmDolares);
        System.out.printf("Valor da conversão de Dólares para Reais: %.2f", valorEmReais);

    }
}
