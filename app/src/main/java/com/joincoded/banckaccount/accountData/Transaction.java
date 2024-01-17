package com.joincoded.banckaccount.accountData;

import androidx.annotation.NonNull;
import androidx.annotation.StringDef;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {

    private int id;
    private String date;
    private Type type;
    private double amount;
    private double balance;
    private int account;

    public Transaction(int id, int account , double amount, Type type , double balance, String date) {
        this.id = id;
        this.account = account;
        this.amount = amount;
        this.type = type;
        this.balance = balance;
        this.date = date;
    }


    public int getId() {
        return id;
    }

    public String getDate() {

        return date;
    }

    public Type getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccount() {
        return account;
    }


    @NonNull
    @Override
    public String toString() {
        return getType().toString() + " - " +
                "ID: " + getId() + ", " +
                "Date: " + getDate() + ", " +
                "Amount: " + getAmount() + ", " +
                "Balance: " + getBalance() + ", " +
                "Account: " + getAccount();


    }


}