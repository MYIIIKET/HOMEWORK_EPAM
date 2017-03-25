package com.mylllket_inc.app;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

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
    public void testThatWeCanPutTheSameNode() {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a.put("aaa", 13));
        assertNotNull(a.put("aaa", 13));
    }

    @Test
    public void testThatWeCanPutManyRandomElements() {
        Random random = new Random();
        CustomTreeMap a = new CustomTreeMap();
        for (int i = 0; i < 10; i++) {
            assertNotNull(a.put(random.nextInt(5) + 1, random.nextInt(6) + 5));
        }
    }

    @Test
    public void testThatTreeCanBeEmpty() {
        CustomTreeMap a = new CustomTreeMap();
        assertTrue(a.isEmpty());
    }

    @Test
    public void testThatTreeCantBeEmpty() {
        CustomTreeMap a = new CustomTreeMap();
        a.put("aaa", 13);
        assertFalse(a.isEmpty());
    }

    @Test
    public void testThatSizeOfTheTreeCanBeZero() {
        CustomTreeMap a = new CustomTreeMap();
        assertEquals(a.size(), 0);
    }

    @Test
    public void testThatSizeOfTheTreeCanBeGreaterThanZero() {
        CustomTreeMap a = new CustomTreeMap();
        a.put("aaa", 1);
        assertTrue(a.size() > 0);
    }

    @Test
    public void testThatWeCanCheckOnKeyContaining() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(5, 1);a.put(4, 4);a.put(7, 5);a.put(2, 3);a.put(3, 11);
        a.put(8, 4);a.put(6, 6);a.put(1, 2);a.put(9, 4);a.put(10, 6);
        assertTrue(a.containsKey(3));
    }

    @Test
    public void testThatWeCantContainKey() {
        CustomTreeMap a = new CustomTreeMap();
        assertFalse(a.containsKey(3));
    }

    @Test
    public void testThatWeCanRemoveElementByKey(){
        CustomTreeMap a = new CustomTreeMap();
        a.put(5, 1);
        a.put(4, 4);
        a.put(7, 5);
        a.put(2, 3);
        a.put(3, 11);
        a.put(8, 4);
        a.put(6, 6);
        a.put(1, 2);
        a.put(9, 4);
        a.put(10, 6);
    }

}