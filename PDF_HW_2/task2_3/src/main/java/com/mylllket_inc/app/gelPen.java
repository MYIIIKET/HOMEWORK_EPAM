package com.mylllket_inc.app;

public class gelPen extends PenExt {
    private static final int defPrice = 5;
    private static final int thickness = 5;

    public gelPen() {
        this.setPrice(this.getPrice() * defPrice);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString() + "| ");
        result.append("Thickness: " + thickness);
        return result.toString();
    }
}
