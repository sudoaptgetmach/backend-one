package org.mach.src.oop.exercicios.getterssetters;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;

        }
        return false;
    }

    public String toString() {
        return "\nNúmero da conta: " + this.getNumeroConta() + "\nTitular: " + this.getTitular() + "\nSaldo: " + String.format("%.2f", this.getSaldo());
    }
}
