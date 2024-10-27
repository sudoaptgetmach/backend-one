package org.mach.src.oop.exercicios;

import org.mach.src.oop.exercicios.getterssetters.ContaBancaria;
import org.mach.src.oop.exercicios.getterssetters.Pessoa;
import org.mach.src.oop.exercicios.reaproveitandocaracteristicas.Cachorro;

import java.util.ArrayList;

public class Executor {

    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Pessoa1", (int) (Math.random() * 100));
        Pessoa pessoa2 = new Pessoa("Pessoa2", (int) (Math.random() * 100));
        Pessoa pessoa3 = new Pessoa("Pessoa3", (int) (Math.random() * 100));

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.toString());
    }
}