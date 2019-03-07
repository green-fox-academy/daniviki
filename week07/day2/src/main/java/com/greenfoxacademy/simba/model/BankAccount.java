package com.greenfoxacademy.simba.model;

import java.io.PrintStream;
import java.text.DecimalFormat;

public class BankAccount {
    String name;
    double balance;
    String currency;
    String animalType;
    boolean isKing;
    boolean isGood;

    public BankAccount(String name,double balance,String currency,String  animalType, boolean isKing, boolean isGood) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isGood = isGood;
    }

    public String getName() {
        return name;
    }

    public String getFormattedBalance(){
        return String.format("%.02f", balance);
    }

    public String getCurrency(){
        return currency;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean getIsKing() {
        return isKing;
    }

    public boolean getIsGood() {
        return isGood;
    }
}
