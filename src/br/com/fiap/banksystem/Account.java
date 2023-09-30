package br.com.fiap.banksystem;

import java.io.Serializable;

/**
 * Classe que abstrai uma conta bancária
 * @author Diego Ramiro
 * @version 1.0
 */

public class Account implements Serializable {
    private static final long serialVersionUID = 4687889408648112701L;
    private int agency;
    private int number;
    private double balance;

    public Account() {

    }

    public Account(int agency, int number, double balance) {
        this.agency = agency;
        this.number = number;
        this.balance = balance;
    }

    /**
     * Acrescenta valor o Saldo da Conta
     * @param value que será depositado
     */
    public void deposit(double value) {
        this.balance += value;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Retira um valor do Saldo da Conta
     * @param  value que será retirado
     */
    public void withdraw(double value) {
        this.balance -= value;
    }

    /**
     * Verifica o Saldo da Conta
     * @return Valor do Saldo da Conta
     */
    public double getBalance() {
        return this.balance;
    }
}

