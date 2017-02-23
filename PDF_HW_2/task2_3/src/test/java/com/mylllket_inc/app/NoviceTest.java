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

        Novice a = new Novice.Builder(null, p2, null).
                addPen(p4).
                addPen(p5).
                addPen(p6).
                addPen(p7).
                addPen(p8).
                addPen(new capillaryPen()).
                build();
        System.out.println(a.toString());

//        Novice b = new Novice.Builder(p1, p2, p3).
//                ballpointPen(p9).
//                addPen(new capillaryPen()).
//                build();
//        System.out.println(b.toString());

    }

}