package com.mylllket_inc.app;

import junit.framework.TestCase;


public class SharedResourceTest extends TestCase {

    public void testGetELement() throws Exception {

        SharedResource s = new SharedResource();
        s.setElement(5);
        System.out.println(s.getELement());
    }

}