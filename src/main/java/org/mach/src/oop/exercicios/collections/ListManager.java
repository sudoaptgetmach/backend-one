package org.mach.src.oop.exercicios.collections;

import org.mach.src.oop.exercicios.getterssetters.ContaBancaria;
import org.mach.src.oop.exercicios.reaproveitandocaracteristicas.Cachorro;
import org.mach.src.oop.exercicios.reaproveitandocaracteristicas.Gato;
import org.mach.src.oop.exercicios.superclasses.Animal;
import org.mach.src.oop.exercicios.superclasses.Produto;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    public static List<Produto> produtos = createProdutos();
    public static List<Animal> animais = createAnimais();
    public static List<ContaBancaria> contas = createContas();

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
    }
}