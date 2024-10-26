package org.mach.src.primeiraaplicacao.projects.bank;

public class CheckingAccount extends Account {

    public CheckingAccount(int accountNumber) {
        super(accountNumber);
    }

    public void mensalTax() {

        int tax = (int) (Math.random() * 300);

        this.withdraw(tax);

        if (tax > this.getBalance()) {

            System.out.println("Você tem uma dívida! O banco cobrou a taxa mensal de " + tax + " e você não teve saldo suficiente pra pagar.");
            System.out.println("Seu saldo agora é de:  R$" + this.getBalance() + ".");

        } else {
            System.out.println("Uma taxa de " + tax + " reais foi cobrada da sua conta.");
            System.out.println("Seu saldo agora é de: R$" + this.getBalance() + ".");
        }
    }
}
