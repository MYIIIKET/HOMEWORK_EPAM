package com.mylllket_inc.app;

public class PenExt extends Pen {
    private int price = 0;

    public PenExt() {
        this.price = 10;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString()+ "| ");
        result.append("Price " + this.price);
        return result.toString();
    }
}
