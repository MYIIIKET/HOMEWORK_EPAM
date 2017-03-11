package com.mylllket_inc.app;

import junit.framework.TestCase;

public class NoviceExtTest extends TestCase {
    public static void main(String[] args) {
        ballpointPen p1 = new ballpointPen();
        gelPen p2 = new gelPen();
        p2.setPrice(2);
        markerPen p3 = new markerPen();
        Novice a1 = new Novice.Builder(p1, p2, p3).addPen(new capillaryPen()).build();
        NoviceExt a = new NoviceExt(new Novice.Builder(p1, p2, p3).addPen(new capillaryPen()));
        System.out.println(a.toString());

        a = a.sortByName();
        System.out.println(a.toString());
        a = a.sortByPrice();
        System.out.println(a.toString());
        a = a.sort();
        System.out.println(a.toString());
    }

}