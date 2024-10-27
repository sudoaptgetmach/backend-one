package org.mach.src.oop.exercicios;

import org.mach.src.oop.exercicios.getterssetters.ProdutoPerecivel;
import org.mach.src.oop.exercicios.superclasses.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Executor {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        Date validade = dateFormat.parse("27 Oct 2024");

        ProdutoPerecivel produto = new ProdutoPerecivel("Produto 1", 35, validade);
        ProdutoPerecivel produto2 = new ProdutoPerecivel("Produto 2", Math.random() * 300, validade);
        Produto produto3 = new Produto("Produto 3", Math.random() * 5000);
        Produto produto4 = new Produto("Produto 4", Math.random() * 1000);

        produto.aplicarDesconto((int) (Math.random() * 100));
        produto2.aplicarDesconto((int) (Math.random() * 100));
        produto3.aplicarDesconto((int) (Math.random() * 100));
        produto4.aplicarDesconto((int) (Math.random() * 100));

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);

        System.out.println("Total de produtos: " + listaDeProdutos.size());
        System.out.println(listaDeProdutos.toString());

    }
}