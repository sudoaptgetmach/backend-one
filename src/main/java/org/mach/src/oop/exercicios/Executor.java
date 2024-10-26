package org.mach.src.oop.exercicios;

import org.mach.src.primeiraaplicacao.projects.bank.CheckingAccount;

public class Executor {

    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(1);
        checkingAccount.deposit(5000);

        System.out.println("Número da sua conta corrente: " + checkingAccount.getAccountNumber());
        System.out.println("Saldo: " + checkingAccount.getBalance());

        checkingAccount.mensalTax();

    }
}
