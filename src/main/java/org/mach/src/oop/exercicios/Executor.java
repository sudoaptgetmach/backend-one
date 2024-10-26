package org.mach.src.oop.exercicios;

import org.mach.src.oop.exercicios.reaproveitandocaracteristicas.GeradorPrimo;
import org.mach.src.oop.exercicios.reaproveitandocaracteristicas.VerificadorPrimo;

public class Executor {

    public static void main(String[] args) {

        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();

        verificador.setPrimo(1);

        gerador.gerarProximoPrimo();
        gerador.gerarProximoPrimo();
        gerador.gerarProximoPrimo();

        boolean ehPrimo = verificador.verificarSeEhPrimo();
        System.out.println("O número é primo? " + ((ehPrimo) ? "Sim." : "Não."));
    }
}