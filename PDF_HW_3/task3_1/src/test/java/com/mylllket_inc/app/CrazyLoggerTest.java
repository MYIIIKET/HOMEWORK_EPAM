package com.mylllket_inc.app;

import junit.framework.TestCase;

public class CrazyLoggerTest extends TestCase {
    public void testSearchByMessage() throws Exception {
        CrazyLogger a = new CrazyLogger();
        a.addEvent("aaa");
        a.addEvent("bbb");
        System.out.println(a.getInfo());
        System.out.println(a.searchByMessage("aaa"));
    }

    public void testSearchByDate() throws Exception {
        CrazyLogger a = new CrazyLogger();
        a.addEvent("aaa");
        a.addEvent("bbb");
        System.out.println(a.getInfo());
        System.out.println(a.searchByDate("26-02-2017:12-41"));
    }

    public void testAddEvent() throws Exception {
        CrazyLogger a = new CrazyLogger();
        a.addEvent("aaa");
        a.addEvent("bbb");
        System.out.println(a.getInfo());
    }

}