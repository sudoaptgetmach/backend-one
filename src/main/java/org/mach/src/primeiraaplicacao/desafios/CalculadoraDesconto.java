package org.mach.src.primeiraaplicacao.desafios;

public class CalculadoraDesconto {

    public static void main(String[] args) {
        double precoOriginal = Math.random() * 1000;
        double percentualDesconto = (int) (Math.random() * 100);
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoFinal = precoOriginal - valorDesconto;

        System.out.printf("Valor original: R$%.2f\n", precoOriginal);
        System.out.printf("Percentual de desconto: %.0f%%\n", percentualDesconto);
        System.out.printf("Valor descontado: %.2f\n", valorDesconto);
        System.out.printf("Valor final: %.2f\n", precoFinal);

    }
}
