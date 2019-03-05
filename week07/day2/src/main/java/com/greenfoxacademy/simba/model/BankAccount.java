package com.greenfoxacademy.simba.model;

import java.io.PrintStream;
import java.text.DecimalFormat;

public class BankAccount {
    String name;
    double balance;
    String currency;
    String animalType;

    public BankAccount(String name,double balance,String currency,String  animalType) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
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

}
