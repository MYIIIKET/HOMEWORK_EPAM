package com.mylllket_inc.app;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class CustomTreeMapTest {

    @Test
    public void testThatWeCanCreateCustomTreeMap() throws Exception {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a);
    }

    @Test
    public void testThatWeCanPut() {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a.put("aaa", 13));
    }

    @Test
    public void testThatWeCanPutToTheLeft() {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a.put("aaa", 13));
        assertNotNull(a.put("bbb", 13));
    }

    @Test
    public void testThatWeCanPutToTheRight() {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a.put("bbb", 13));
        assertNotNull(a.put("aaa", 13));
    }

    @Test
    public void testThatWeCanPutTheSameNode(){
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a.put("aaa", 13));
        assertNotNull(a.put("aaa", 13));
    }

    @Test
    public void testThatWeCanPutManyRandomElements() {
        Random random = new Random();
        CustomTreeMap a = new CustomTreeMap();
        for (int i = 0; i < 10; i++) {
            assertNotNull(a.put(random.nextInt(5)+1,random.nextInt(6)+5));
        }
    }

}