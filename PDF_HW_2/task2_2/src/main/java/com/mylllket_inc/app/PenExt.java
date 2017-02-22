package com.mylllket_inc.app;

public class PenExt extends Pen {
    private int price = 0;
    private static final int defPrice=10;

    public PenExt() {
        this.price = defPrice;
    }

    public void setPrice(int price) {
        if (price > 0)
            this.price = price;
        else this.price=defPrice;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString() + "| ");
        result.append("Price " + this.price);
        return result.toString();
    }

    @Override
    public int hashCode() {
        return this.price * super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(this) && (this.price == ((PenExt) o).price);
    }
}
