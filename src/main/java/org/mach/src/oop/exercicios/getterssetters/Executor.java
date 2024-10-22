package org.mach.src.oop.exercicios.getterssetters;

public class Executor {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(); // funcionando
        IdadePessoa idade = new IdadePessoa(); // funcionando
        Produto produto = new Produto(); // funcionando
        Aluno aluno = new Aluno(); // funcionando
        Livro livro = new Livro(); // funcionando

        aluno.setNome("Teste");
        aluno.addNota(3);
        aluno.addNota(9.3);
        aluno.addNota(2.3);

        System.out.println("Nome: " + aluno.getNome());
        for (int i = 0; i < aluno.getNotas().size(); i++) {
            System.out.println("Nota: " + aluno.getNotas().get(i));
        }
        System.out.printf("Média: %.2f\n", aluno.calcularMedia());

        livro.setAutor("Teste");
        livro.setTitulo("Teste");
        livro.exibirDetalhes();
    }
}
