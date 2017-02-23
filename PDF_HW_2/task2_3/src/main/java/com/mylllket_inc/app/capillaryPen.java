package com.mylllket_inc.app;

public class capillaryPen extends PenExt {
    private static final int defPrice = 3;
    private static final int thickness = 3;

    public capillaryPen() {
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
