package com.mylllket_inc.app;

public class ballpointPen extends PenExt {
    private static final int defPrice = 1;
    private static final int thickness = 1;

    public ballpointPen() {
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
