package org.mach.src.oop.reaproveitandocaracteristicas;

import org.mach.src.oop.superclasses.NumerosPrimos;

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
