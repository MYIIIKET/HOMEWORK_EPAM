package com.mylllket_inc.app;

import junit.framework.TestCase;

public class NoviceTest extends TestCase {
    public void testToString() throws Exception {
        ballpointPen p1 = new ballpointPen();
        gelPen p2 = new gelPen();
        markerPen p3 = new markerPen();

        capillaryPen p4 = new capillaryPen();
        capillaryPen p5 = new capillaryPen();
        capillaryPen p6 = new capillaryPen();

        fountainPen p7 = new fountainPen();
        fountainPen p8 = new fountainPen();

        ballpointPen p9 = new ballpointPen();

        Novice a = new Novice.Builder(p1, p2, p3).
                capillaryPen(p4).
                capillaryPen(p5).
                capillaryPen(p6).
                fountainPen(p7).
                fountainPen(p8).
                build();
        System.out.println(a.toString());

        Novice b = new Novice.Builder(p1, p2, p3).ballpointPen(p9).build();
        System.out.println(b.toString());

    }

}