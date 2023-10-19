package br.com.fiap.banksystem;
public class Test {
    public static void main(String[] args) {

        //Método withdraw, sem utilizar polimorfismo
        Account account1 = new Account();
        account1.deposit(1500);
        account1.withdraw(200);

        //Polimorfismo Sobrecrita de método, do método withdraw
        CurrentAccount account2 = new CurrentAccount();
        account2.deposit(1700);
        account2.withdraw(300);

        //Polimorfismo Sobrecrita de método, do método withdraw
        Account account3 = new CurrentAccount();
        account3.deposit(600);
        account3.withdraw(150);

        System.out.println("Saldo conta1: " + account1.getBalance());
        System.out.println("Saldo conta2: " + account2.getBalance());
        System.out.println("Saldo conta3: " + account3.getBalance());

        /*// Herança hands-on
        Account account = new Account();
        Account ca = new CurrentAccount();

        CurrentAccount account1 = (CurrentAccount) ca;

        if (account instanceof CurrentAccount) {
            CurrentAccount account2 = (CurrentAccount) account;
        }*/

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
