package org.mach.src.oop.exercicios;

public class Executor {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Dobro dobro = new Dobro(5);

        Musica musica = new Musica("Música", "Teste", 1993);
        musica.avaliar(4);
        musica.avaliar(1);
        musica.avaliar(0);
        musica.avaliar(5);
        musica.avaliar(9);

        Carro carro = new Carro("Fiat Uno", 2006, "Prata");
        carro.setFichatecnica("Lorem ipsum.");

        Aluno aluno = new Aluno();
        aluno.setNome("Aluno");
        aluno.setIdade(400);

        System.out.println("Primeiro exercício - retorna frase do objeto: ");
        System.out.println(pessoa.getFrase() + "\n");

        System.out.println("Segundo exercício - dobro:");
        System.out.println(dobro.getNumero() + "\n");

        System.out.println("Terceiro exercício - classe Música:");
        System.out.println("Nome da música: " + musica.getNome());
        System.out.println("Artista: " + musica.getArtista());
        System.out.println("Ano de lançamento: " + musica.getAnoDeLancamento() + "\n");
        System.out.println("Número de avaliações: " + musica.getNumeroAvaliacoes());
        System.out.println("Média de avaliações: " + musica.getMediaAvaliacoes() + "\n");

        System.out.println("Quarto exercício - Carro:");
        System.out.println("Marca e modelo: " + carro.getNome());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor() + "\n");
        System.out.println("Ficha técnica: " + carro.getFichatecnica());
        System.out.println("Idade do carro: " + carro.getIdade() + " anos. \n");


        System.out.println("Quinto exercício - Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
    }
}
