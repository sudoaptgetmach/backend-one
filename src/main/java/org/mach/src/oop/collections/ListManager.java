package org.mach.src.oop.collections;

import org.mach.src.oop.getterssetters.ContaBancaria;
import org.mach.src.oop.reaproveitandocaracteristicas.Cachorro;
import org.mach.src.oop.reaproveitandocaracteristicas.Gato;
import org.mach.src.oop.superclasses.Animal;
import org.mach.src.oop.superclasses.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListManager {

    public static List<Produto> produtos = createProdutos();
    public static List<Animal> animais = createAnimais();
    public static List<ContaBancaria> contas = createContas();
    public static List<Integer> listaNumerica = createLista();
    List<String> listaPolimorfica;

    private static List<Integer> createLista() {
        List<Integer> listaNumerica = new ArrayList<>();
        for (int i = 1; i <= (int) (Math.random() * 30) + 10; i++) {
            listaNumerica.add(i);
        }
            return listaNumerica;
    }

    private static List<Produto> createProdutos() {
        List<Produto> produtos = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            produtos.add(new Produto("Produto " + i, Math.random() * 1000));
        }
        return produtos;
    }

    private static List<Animal> createAnimais() {
        List<Animal> animais = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            animais.add(new Cachorro("Cachorro " + i, "Mamífero", (int) (Math.random() * 15), 55, 20, "Au au"));
        }
        for (int i = 1; i <= 2; i++) {
            animais.add(new Gato("Gato " + i, "Mamífero", (int) (Math.random() * 15), 55, 20, "Miau"));
        }
        return animais;
    }

    private static List<ContaBancaria> createContas() {
        List<ContaBancaria> contas = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            contas.add(new ContaBancaria(i, "Conta " + i, Math.random() * 10000));
        }
        return contas;
    }

    public void listManager() {

        /*
        contas.forEach(System.out::println);

        double maxSaldo = Double.NEGATIVE_INFINITY;
        String titular = "N/A";
        int id = -1;
        for (ContaBancaria contaitem : contas) {
            if (contaitem.getSaldo() > maxSaldo) {
                maxSaldo = contaitem.getSaldo();
                id = contaitem.getNumeroConta();
                titular = contaitem.getTitular();
            }
        }
        System.out.println("\nA conta com maior saldo encontrada foi: ");
        System.out.println("ID da conta: " + id +
                           "\nNome do titular: " + titular);
        System.out.println("Maior saldo: " + String.format("%.2f", maxSaldo));

        animais.forEach(animal -> System.out.println(animal.toString()));

        double somaPrecos = 0;
        for (Produto produtoitem : produtos) {
            somaPrecos += produtoitem.getPreco();
        }
        double media = somaPrecos / produtos.size();
        System.out.println("Média dos preços dos produtos: " + String.format("%.2f", media));

        produtos.forEach(System.out::println);
         */

        System.out.println("Lista: ");
        listaNumerica.forEach(System.out::println);

        System.out.println("\nLista Ordenada: ");
        Collections.sort(listaNumerica);
        listaNumerica.forEach(System.out::println);

        System.out.println("\nLista Ordenada reversa: ");
        Collections.sort(listaNumerica.reversed());
        listaNumerica.forEach(System.out::println);

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Teste 1");
        listaPolimorfica.add("Teste 2");
        listaPolimorfica.add("Teste 3");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        listaPolimorfica.add("Elemento C");
        System.out.println("LinkedList: " + listaPolimorfica);

    }
}