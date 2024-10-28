package org.mach.src.oop.reaproveitandocaracteristicas;

public class VerificadorPrimo {

    private int numero;

    public void setPrimo(int numero) {
        this.numero = numero;
    }

    public boolean verificarSeEhPrimo() {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}