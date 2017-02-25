package com.mylllket_inc.app;

import junit.framework.TestCase;


public class EngineTest extends TestCase {
    public void testBuildSubmarine() throws Exception {
        Class enClass = Class.forName("com.mylllket_inc.app.Submarine$Engine");
        Class subClass = Class.forName("com.mylllket_inc.app.Submarine");


        Submarine.Engine e1 = new Submarine.Engine.Builder("aaa", 15).BuildEngine();
        Submarine s1 = e1.BuildSubmarine();
        System.out.println(subClass.isAnnotationPresent(SubmarineExist.class));
        System.out.println(enClass.isAnnotationPresent(EngineExist.class));

        if (!(subClass.isAnnotationPresent(SubmarineExist.class) || enClass.isAnnotationPresent(EngineExist.class))) {
            System.err.println("no annotation");
        } else {
            System.out.println("class annotated ; name  -  " +
                    subClass.getAnnotation(SubmarineExist.class) + " " +
                    enClass.getAnnotation(EngineExist.class));
        }
    }

}