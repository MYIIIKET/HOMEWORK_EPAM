package com.mylllket_inc.app;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    public void testAdd() throws Exception {
        Person a = new Person();
        Person b = new Person();

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
        a.setStationery(p6);
        a.add(p2);
        b.add(p2);
        b.addStationery(p6);
        System.out.println(a.toString());
        System.out.println(b.toString());

    }

}