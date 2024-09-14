package org.mach.src.primeiraaplicacao;

import java.util.Scanner;

public class Perfil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        String email = scanner.next();


        scanner.nextLine(); // necessário para limpar o buffer, caso contrário, vc não consegue prosseguir para o nextLine
        String comidas = scanner.nextLine();

        System.out.println("Olá, " + nome);
        System.out.println("Tudo bem?");
        System.out.println("Qual é o seu e-mail?");
        System.out.println(email);
        System.out.println("Quais são suas comidas preferidas?");
        System.out.println(comidas);

    }

}
