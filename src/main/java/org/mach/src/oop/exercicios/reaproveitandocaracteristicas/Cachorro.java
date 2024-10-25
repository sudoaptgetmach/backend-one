package org.mach.src.oop.exercicios.reaproveitandocaracteristicas;

import org.mach.src.oop.exercicios.superclasses.Animal;

public class Cachorro extends Animal {

    public void abanarRabo() {
        String acao = "O cachorro está abanando o rabo!";
        System.out.println(acao);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo!");
    }
}