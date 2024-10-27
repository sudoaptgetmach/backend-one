package org.mach.src.primeiraaplicacao.desafios;

public class ProdutoDesafio {

    public static void main(String[] args) {

        int quantidade = (int) (Math.random() * 101);
        double precoProduto = Math.random() * 1001;
        double resultado = quantidade * precoProduto;

        System.out.println("Quantidade de produtos: " + quantidade);
        System.out.printf("Valor dos produtos: %.2f\n", precoProduto);
        System.out.printf("Preço total: %.2f\n", resultado);

    }
}
