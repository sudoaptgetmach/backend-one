package org.mach.src.oop.reaproveitandocaracteristicas;

import org.mach.src.oop.superclasses.Animal;

public class Cachorro extends Animal {


    public Cachorro(String nome, String tipo, int idade, int tamanho, int expectativaVida, String som) {
        super(nome, tipo, idade, tamanho, expectativaVida, som);
    }

    public void abanarRabo() {
        String acao = "O cachorro está abanando o rabo!";
        System.out.println(acao);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo!");
    }
}