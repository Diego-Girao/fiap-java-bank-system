package br.com.fiap.banksystem;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -2307404922933136199L;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
