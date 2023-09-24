package br.com.fiap.banksystem;

public class Account {
    int agency;
    int number;
    double balance;

    public Account() {

    }

    public Account(int agency, int number, double balance) {
        this.agency = agency;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    public double verifyBalance() {
        return this.balance;
    }
}

