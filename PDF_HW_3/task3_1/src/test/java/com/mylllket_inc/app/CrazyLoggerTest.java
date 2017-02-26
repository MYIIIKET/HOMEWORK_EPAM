package com.mylllket_inc.app;

import junit.framework.TestCase;

public class CrazyLoggerTest extends TestCase {
    public void testAddEvent() throws Exception {
        CrazyLogger a = new CrazyLogger();
        a.addEvent("aaa");
        a.addEvent("bbb");
        System.out.println(a.getInfo());
    }

}