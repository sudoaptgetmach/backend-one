package org.mach.src.primeiraaplicacao.projects.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankSystem {

    private final Map<Integer, Account> accounts = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);
    private int accountNumberCounter = 1;

    public void init() {
        boolean iniciado = true;

        while (iniciado) {
            System.out.println("**********************************");
            System.out.println("1. Criar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Verificar saldo");
            System.out.println("5. Sair");
            System.out.println("**********************************");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    iniciado = false;
                    break;
                default:
                    System.out.println("Escolha uma opção válida.");
            }
        }
    }

    public void createAccount() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.next();
        Customer customer = new Customer(nome);
        Account account = new Account(accountNumberCounter++);
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Conta criada com sucesso para " + customer.getNome() + " com o número de conta: " + account.getAccountNumber());
    }

    private void deposit() {
        System.out.print("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.print("Digite o valor do depósito: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + account.getBalance());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private void withdraw() {
        System.out.print("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.print("Digite o valor do saque: ");
            double amount = scanner.nextDouble();
            if (account.withdraw(amount)) {
                System.out.println("Saque realizado com sucesso. Novo saldo: " + account.getBalance());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private void checkBalance() {
        System.out.print("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Saldo da conta: " + account.getBalance());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();
        bankSystem.init();
    }
}