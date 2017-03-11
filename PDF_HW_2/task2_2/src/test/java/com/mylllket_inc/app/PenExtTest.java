package com.mylllket_inc.app;

import junit.framework.TestCase;

public class PenExtTest extends TestCase {

    public void testThatPenHasDefaultPrice() {
        PenExt p = new PenExt();
        assertTrue(p.getPrice() == 10);
    }

    public void testThatPriceCanBeSetToPen() {
        PenExt p = new PenExt();
        p.setPrice(15);
        assertTrue(p.getPrice() == 15);
    }

    public void testThatPenExtEqualsPenExt() {
        PenExt p1 = new PenExt();
        PenExt p2 = p1;
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
    }

    public void testThatPenExtNotEqualsPenExt() {
        PenExt p1 = new PenExt();
        PenExt p2 = new PenExt();
        assertFalse(p1.equals(p2));
        assertFalse(p2.equals(p1));
    }

    public void testThatPenExtNotEqualsOtherObjects() {
        PenExt p = new PenExt();
        Object o = new Object();
        assertFalse(p.equals(o));
        assertFalse(o.equals(p));
    }

    public void testThatPexExtNotEqualsNull() {
        PenExt p = new PenExt();
        assertFalse(p.equals(null));
    }

}