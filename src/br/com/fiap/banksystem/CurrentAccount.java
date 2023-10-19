package br.com.fiap.banksystem;

public class CurrentAccount extends Account {
    private String type;
    private double overdraft;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    public double getTotalBalance(){
        return super.getBalance() + overdraft;
    }
}

