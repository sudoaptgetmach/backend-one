package org.mach.src.oop.exercicios.reaproveitandocaracteristicas;

import org.mach.src.oop.exercicios.superclasses.Animal;

public class Gato extends Animal {

    public Gato(String nome, String tipo, int idade, int tamanho, int expectativaVida, String som) {
        super(nome, tipo, idade, tamanho, expectativaVida, som);
    }

    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato está miando!");
    }
}
