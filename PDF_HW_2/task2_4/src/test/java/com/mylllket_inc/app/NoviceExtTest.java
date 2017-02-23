package com.mylllket_inc.app;

import junit.framework.TestCase;


public class NoviceExtTest extends TestCase {
    public static void main(String[] args) {
        ballpointPen p1 = new ballpointPen();
        gelPen p2 = new gelPen();
        markerPen p3 = new markerPen();
        NoviceExt a = new NoviceExt(new Novice.Builder(p1,p2,p3));

        a.sortByName();
        System.out.println(a.toString());
    }

}