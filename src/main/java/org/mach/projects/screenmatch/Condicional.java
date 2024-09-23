package org.mach.projects.screenmatch;

public class Condicional {

    public static void main(String[] args) {

        int anoDeLancamento;
        anoDeLancamento = 2022;
        double notaDoFilme = 8.1;

        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2000) {
            System.out.println("Esse filme não faz parte do catálogo retrô.");

        } else {
            System.out.println("Esse filme faz parte do catálogo retrô.");

        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Incluído no plano.");

        } else {
            System.out.println("Membro deverá comprar o filme.");
        }
    }
}
