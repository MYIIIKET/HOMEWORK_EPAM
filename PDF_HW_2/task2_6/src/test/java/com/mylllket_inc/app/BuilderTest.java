package com.mylllket_inc.app;

import junit.framework.TestCase;


public class BuilderTest extends TestCase {
    public void testSetPower() throws Exception {
        Submarine s1 = new Submarine.Engine.Builder("aaa", 15).BuildEngine().BuildSubmarine();
        Submarine s2 = new Submarine.Engine.Builder("bbb", 31).BuildEngine().BuildSubmarine();
        Submarine s3 = new Submarine.Engine.Builder("ccc", 55).BuildEngine().BuildSubmarine();
        s3.start();
        System.out.println(s1.getStatus() + s2.getStatus() + s3.getStatus());
    }

}