package br.com.fiap.banksystem;

public class Test {
    public static void main(String[] args) {
//        Utilizando o Construtor padrão
        Account cc = new Account();
        cc.balance = 75.0;
        cc.agency = 123;
        cc.number = 456;

        cc.deposit(925);

        System.out.println("Current Account Total Balance: " + cc.verifyBalance());

//        Utilizando o Construtor de clasee
        Account savings = new Account(001, 789, 1000);
        savings.withdraw(150);

        System.out.println("Savings Account Total Balance: " + savings.verifyBalance());
    }
}
