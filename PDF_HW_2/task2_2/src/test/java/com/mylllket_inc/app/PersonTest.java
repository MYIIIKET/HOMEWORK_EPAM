package com.mylllket_inc.app;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void testThatPersonCanStorePens() throws Exception {
        Person a = new Person();
        PenExt p1 = new PenExt();
        PenExt p2 = new PenExt();
        a.add(p1);
        a.add(p2);
        assertTrue(a.contains(p1));
        assertTrue(a.contains(p2));
    }

    public void testThatPersonCantHaveTwoSamePens() {
        Person a = new Person();
        PenExt p1 = new PenExt();
        a.add(p1);
        a.add(p1);
        assertTrue(a.getList().length == 1);
    }

    public void testThatStationaryCanBeAddedToPerson() {
        Person a = new Person();

        PenExt[] p = new PenExt[3];
        for (int i = 0; i < p.length; i++) {
            p[i] = new PenExt();
        }
        a.addStationery(p);

        for (int i = 0; i < p.length; i++) {
            assertTrue(a.contains(p[i]));
        }
    }

    public void testThatNewStationaryCanBeSetToPerson() {
        Person a = new Person();
        PenExt p1 = new PenExt();
        a.add(p1);
        assertTrue(a.contains(p1));
        assertTrue(a.getList().length == 1);

        PenExt[] p = new PenExt[3];
        for (int i = 0; i < p.length; i++) {
            p[i] = new PenExt();
        }
        a.setStationery(p);

        for (int i = 0; i < p.length; i++) {
            assertTrue(a.contains(p[i]));
        }
        assertFalse(a.contains(p1));
        assertTrue(a.getList().length == 3);
    }
}