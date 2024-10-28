package org.mach.src.oop.superclasses;

public class NumerosPrimos {

    private int primo;

    public void setPrimo(int primo) {
        this.primo = primo;
    }

    public boolean verificarPrimalidade(int n) {

        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
