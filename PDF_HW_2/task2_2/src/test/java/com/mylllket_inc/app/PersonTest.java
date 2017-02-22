package com.mylllket_inc.app;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    public void testSetStationery() throws Exception {
        Person a = new Person();
        PenExt[] a_1 = new PenExt[10];
        for (int i = 0; i < a_1.length; i++) {
            a_1[i] = new PenExt();
            a_1[i].setPrice(i + 1);
        }
        a.setStationery(a_1);
        System.out.println(a.toString());
//        Stationery stationery = new Stationery(a_1);
//        stationery.toString();
    }

}