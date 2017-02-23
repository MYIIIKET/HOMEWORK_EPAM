package com.mylllket_inc.app;


public class markerPen extends PenExt {
    private static final int defPrice = 4;
    private static final int thickness = 4;

    public markerPen() {
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
