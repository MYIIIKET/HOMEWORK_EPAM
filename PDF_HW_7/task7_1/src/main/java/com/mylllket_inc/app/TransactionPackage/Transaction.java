package com.mylllket_inc.app.TransactionPackage;

public class Transaction {
    private int id;
    private String from;
    private String to;

    protected void setId(int id) {
        this.id = id;
    }

    protected void setFrom(String from) {
        this.from = from;
    }

    protected void setTo(String to) {
        this.to = to;
    }

    public int getId() {
        return this.id;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }
}
