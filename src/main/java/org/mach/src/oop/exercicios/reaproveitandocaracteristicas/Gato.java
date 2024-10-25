package org.mach.src.oop.exercicios.reaproveitandocaracteristicas;

import org.mach.src.oop.exercicios.superclasses.Animal;

public class Gato extends Animal {

    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato está miando!");
    }
}
