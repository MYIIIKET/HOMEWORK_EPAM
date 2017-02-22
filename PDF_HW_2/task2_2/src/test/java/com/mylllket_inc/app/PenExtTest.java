package com.mylllket_inc.app;

import junit.framework.TestCase;

public class PenExtTest extends TestCase {

    public void testHashCode() throws Exception {
        PenExt a = new PenExt();
        PenExt b = new PenExt();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    public void testEquals() throws Exception {

    }

    public void testToString() throws Exception {
        PenExt a = new PenExt();
        PenExt b = a;

        System.out.println(a.toString());
        System.out.println(b.toString());

        b = new PenExt();
        b.setPrice(15);
        System.out.println(b.toString());

        Pen c = new Pen();
        System.out.println(c.toString());
    }

    public void testPrice() throws Exception {
        PenExt a = new PenExt();
        int def = 10;

        a.setPrice(5);
        assertEquals(a.getPrice(), 5);

        a.setPrice(11);
        assertEquals(a.getPrice(), 11);

        PenExt b = new PenExt();
        assertEquals(b.getPrice(), def);
    }

}