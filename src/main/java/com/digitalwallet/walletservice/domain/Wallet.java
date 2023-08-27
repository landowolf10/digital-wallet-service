package com.digitalwallet.walletservice.domain;

import java.math.BigDecimal;

public class Wallet {
    private final Customer customer;
    private BigDecimal balance;
    private String currency;

    public Wallet(Customer customer, BigDecimal balance, String currency) {
        this.customer = customer;
        this.balance = balance;
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
