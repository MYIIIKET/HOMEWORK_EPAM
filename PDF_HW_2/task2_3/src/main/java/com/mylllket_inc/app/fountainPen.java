package com.mylllket_inc.app;


public class fountainPen extends PenExt {
    private static final int defPrice = 6;
    private static final int thickness = 6;

    public fountainPen() {
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
