package com.mylllket_inc.app;

public class biopolymericPen extends PenExt {
    private static final int defPrice = 2;
    private static final int thickness = 2;

    public biopolymericPen() {
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
