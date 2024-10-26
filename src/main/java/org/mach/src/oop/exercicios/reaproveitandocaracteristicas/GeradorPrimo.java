package org.mach.src.oop.exercicios.reaproveitandocaracteristicas;

import org.mach.src.oop.exercicios.superclasses.NumerosPrimos;

public class GeradorPrimo extends NumerosPrimos {

    private int ultimoPrimo = 1;

    public void gerarProximoPrimo() {
        int numero = ultimoPrimo + 1;

        while (!verificarPrimalidade(numero)) {
            numero++;
        }

        ultimoPrimo = numero;
        System.out.println("Próximo primo: " + ultimoPrimo);
    }
}
