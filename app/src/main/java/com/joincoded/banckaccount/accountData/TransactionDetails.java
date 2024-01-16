package com.joincoded.banckaccount.accountData;

public class TransactionDetails {
    private int id;
    private String date;
    private Type type;
    private double amount;
    private double balance;
    private int account;
    public TransactionDetails(int id, String date, Type type, double amount, double balance, int account) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.account = account;
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





}
