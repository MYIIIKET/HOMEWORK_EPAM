package com.mylllket_inc.app;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomHashMapTest {

    @Test
    public void testThatWeCanCreateHashMap() {
        CustomHashMap a = new CustomHashMap();
        assertNotNull(a);
    }

    @Test
    public void testThatWeCanGetEmptySize() {
        CustomHashMap a = new CustomHashMap();
        HashMap b = new HashMap();
        assertEquals(a.size(), b.size());
    }

    @Test
    public void testThatWeCanGetNonEmptySize() {
        CustomHashMap a = new CustomHashMap();
        HashMap b = new HashMap();

        a.put("aaa", 5);
        b.put("aaa", 5);

        assertEquals(a.size(), b.size());
    }

    @Test
    public void testThatWeCanPutValue() {
        CustomHashMap a = new CustomHashMap();
        assertEquals(a.put("aaa", 15), 15);
    }

    @Test
    public void testThatWeCanPutSameKeysAndSameValues() {
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 15);
        a.put("aaa", 15);
    }

    @Test
    public void testThatWeCanPutDifferentKeysAndSameValues() {
        CustomHashMap a = new CustomHashMap();
        assertEquals(a.put("aaa", 15), 15);
        assertEquals(a.put("bbb", 13), 13);
    }

    @Test
    public void testThatWeCanPutSameKeysAndDifferentValues() {
        CustomHashMap a = new CustomHashMap();
        assertEquals(a.put("aaa", 12), 12);
        assertEquals(a.put("aaa", 13), 13);
    }

    @Test
    public void testThatHashMapCanContainsValue() {
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa", 15);
        a.put("aaa", 17);
        a.put("aaa", 19);
        assertTrue(a.containsValue(13));
        assertTrue(a.containsValue(19));
    }

    @Test
    public void testThatHashMapCantContainsValue() {
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa", 15);
        a.put("aaa", 17);
        a.put("aaa", 19);
        assertFalse(a.containsValue(5));
    }

    @Test
    public void testThatHashMapCanContainsKey() {
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa", 15);
        a.put("aaa", 17);
        a.put("aaa", 19);
        assertTrue(a.containsKey("aaa"));
    }

    @Test
    public void testThatHashMapCantContainsKey() {
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa", 15);
        a.put("aaa", 17);
        a.put("aaa", 19);
        assertFalse(a.containsKey("bbb"));
    }

    @Test
    public void testThatWeCanGetEntryLinkedList() {
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa", 15);
        a.put("aaa", 17);
        a.put("aaa", 19);
        Object[] values = a.getEntry("aaa");
        assertEquals(values[0], 13);
        assertEquals(values[3], 19);
    }

    @Test
    public void testThatWeCanRemoveByKey() {
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa", 15);
        a.put("aaa", 17);
        a.put("aaa", 19);
        a.put("bbb", 1);
        a.put("bbb", 2);
        a.put("bbb", 3);
        a.put("bbb", 4);
        a.put("bbb", 5);

        Object[] values = a.getEntry("aaa");
        assertEquals(values[0], 13);
        assertEquals(values[3], 19);

        values = a.getEntry("bbb");
        assertEquals(values[0], 1);
        assertEquals(values[4], 5);

        a.remove("bbb");

        values = a.getEntry("bbb");
        assertNull(values);

        values = a.getEntry("aaa");
        assertEquals(values[0], 13);
        assertEquals(values[3], 19);
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantPutNullKey() {
        CustomHashMap a = new CustomHashMap();
        a.put(null, 12);
    }

    @Test
    public void testThatWeCanAddAllElementsFromMapToOurMap() {
        CustomHashMap a = new CustomHashMap();
        Map b = new HashMap<Integer, Integer>();
        for (int i = 0; i < 18; i++) {
            b.put(i, i);
        }
        a.putAll(b);
        for (int i = 0; i < 16; i++) {
            assertTrue(a.containsKey(i));
        }
    }

    @Test
    public void testThatWeCanClearOurMap() {
        CustomHashMap a = new CustomHashMap();
        for (int i = 0; i < 10; i++) {
            a.put(i, i);
        }
        assertEquals(10, a.size());
        a.clear();
        assertEquals(0, a.size());
    }


}