package com.mylllket_inc.app;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    public void testAdd() throws Exception {
        Person a = new Person();

        Pen p1 = new Pen();
        PenExt p2 = new PenExt();
        p2.setPrice(15);
        Pen p3 = new PenExt();

        Pen[] p4 = new Pen[3];
        Pen[] p5 = new PenExt[3];
        PenExt[] p6 = new PenExt[3];

        for (int i = 0; i < 3; i++) {
            p4[i] = new Pen();
            p5[i] = new PenExt();
            p6[i] = new PenExt();
        }
        a.setStationery(p4);
        a.add(p1);
        System.out.println(a.toString());
    }

    public void testSetStationery() throws Exception {
        Person a = new Person();
        PenExt[] a_1 = new PenExt[10];
        for (int i = 0; i < a_1.length; i++) {
            a_1[i] = new PenExt();
            a_1[i].setPrice(i + 1);
        }
        a.setStationery(a_1);
        System.out.println(a.toString());
    }

}