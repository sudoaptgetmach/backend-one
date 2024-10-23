package org.mach.src.oop.exercicios;

import org.mach.src.oop.exercicios.reaproveitandocaracteristicas.ModeloCarro;

public class Executor {

    public static void main(String[] args) {

        ModeloCarro carro = new ModeloCarro();

        carro.setNome("Fiat Uno");
        carro.setFichatecnica("Vem com escada!");
        carro.setCor("Preto");
        carro.setTipo("Superesportivo");
        carro.setAno(1997);
        carro.addPrecos(30000);
        carro.addPrecos(25000);
        carro.addPrecos(10000);

        System.out.println("Nome: " + carro.getNome());
        System.out.println("Ano: " + carro.getAno());;
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Teto solar: " + carro.isTetoSolar());
        System.out.println("Tipo: " + carro.getTipo());
        System.out.println();
        System.out.println("Preços por ano:");
        carro.getPrecos();
        System.out.printf("Preço médio: R$ %.2f\n", carro.getPrecoMedio());
        System.out.println("Maior preço: R$ " + carro.getMaiorPreco());
        System.out.println("Menor preço: R$ " + carro.getMenorPreco());

    }
}
