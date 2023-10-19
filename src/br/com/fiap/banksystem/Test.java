package br.com.fiap.banksystem;

public class Test {
    public static void main(String[] args) {
Account account = new Account();
Account ca = new CurrentAccount();

CurrentAccount account1 = (CurrentAccount) ca;

if(account instanceof CurrentAccount){
    CurrentAccount account2 = (CurrentAccount) account;
}
        /*//        Utilizando o Construtor padrão
        Account cc = new Account();
        cc.deposit(55);
        cc.setAgency(123);
        cc.setNumber(456);

        cc.deposit(925);

        System.out.println("Current Account Total Balance: " + cc.getBalance());

//        Utilizando o Construtor de classe
        Account savings = new Account(1, 789, 1000);
        savings.withdraw(150);

        System.out.println("Savings Account Total Balance: " + savings.getBalance());*/
    }
}
