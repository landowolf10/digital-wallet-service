package com.digitalwallet.walletservice.domain;

public class Customer {
    private int customerID;
    private String documentNumber;
    private String phoneNumber;
    private String typeDocument;
    private String email;
    private String name;
    private String sureName;

    public Customer(int customerID, String documentNumber, String phoneNumber, String typeDocument, String email,
                    String name, String sureName) {
        this.customerID = customerID;
        this.documentNumber = documentNumber;
        this.phoneNumber = phoneNumber;
        this.typeDocument = typeDocument;
        this.email = email;
        this.name = name;
        this.sureName = sureName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}
