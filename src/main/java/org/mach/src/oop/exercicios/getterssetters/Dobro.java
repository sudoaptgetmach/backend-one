package org.mach.src.oop.exercicios.getterssetters;

public class Dobro {

    private final int numero;

    public Dobro(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return (numero * 2);
    }
}
