package com.digitalwallet.walletservice.domain;

public class Wallet {
    private Customer customer;
    private float balance;
    private float currency;

    public Wallet(Customer customer, float balance, float currency) {
        this.customer = customer;
        this.balance = balance;
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public float getBalance() {
        return balance;
    }

    public float getCurrency() {
        return currency;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setCurrency(float currency) {
        this.currency = currency;
    }
}
