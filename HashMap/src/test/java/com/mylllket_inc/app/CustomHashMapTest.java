package com.mylllket_inc.app;

import junit.framework.TestCase;

import java.util.HashMap;

public class CustomHashMapTest extends TestCase {

    public void testThatWeCanCreateHashMap() {
        CustomHashMap a = new CustomHashMap();
    }

    public void testThatWeCanGetEmptySize() {
        CustomHashMap a = new CustomHashMap();
        HashMap b = new HashMap();
        assertEquals(a.size(), b.size());
    }

    public void testThatWeCanGetNonEmptySize(){
        CustomHashMap a = new CustomHashMap();
        HashMap b = new HashMap();

        a.put("aaa",5);
        b.put("aaa",5);

        assertEquals(a.size(),b.size());
    }


    public void testThatWeCanPutValue() {
        CustomHashMap a = new CustomHashMap();
        assertEquals(a.put("aaa", 15), 15);
    }


    public void testThatWeCanPutSameKeysAndSameValues() {
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 15);
        a.put("aaa", 15);
    }

    public void testThatWeCanPutDifferentKeysAndSameValues() {
        CustomHashMap a = new CustomHashMap();
        assertEquals(a.put("aaa", 15),15);
        assertEquals(a.put("bbb", 13),13);
    }

    public void testThatWeCanPutSameKeysAndDifferentValues() {
        CustomHashMap a = new CustomHashMap();
        assertEquals(a.put("aaa", 12),12);
        assertEquals(a.put("aaa", 13),13);
    }

    public void testThatHashMapCanContainsValue(){
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa",15);
        a.put("aaa",17);
        a.put("aaa",19);
        assertTrue(a.containsValue(13));
        assertTrue(a.containsValue(19));
    }

    public void testThatHashMapCantContainsValue(){
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa",15);
        a.put("aaa",17);
        a.put("aaa",19);
        assertFalse(a.containsValue(5));
    }

    public void testThatHashMapCanContainsKey(){
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa",15);
        a.put("aaa",17);
        a.put("aaa",19);
        assertTrue(a.containsKey("aaa"));
    }

    public void testThatHashMapCantContainsKey(){
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa",15);
        a.put("aaa",17);
        a.put("aaa",19);
        assertFalse(a.containsKey("bbb"));
    }

    public void testThatWeCanGetEntryLinkedList(){
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa",15);
        a.put("aaa",17);
        a.put("aaa",19);
        Object[] values = a.getEntry("aaa");
        assertEquals(values[0],13);
        assertEquals(values[3],19);
    }

    public void testThatWeCanRemoveByKey(){
        CustomHashMap a = new CustomHashMap();
        a.put("aaa", 13);
        a.put("aaa",15);
        a.put("aaa",17);
        a.put("aaa",19);
        a.put("bbb", 1);
        a.put("bbb",2);
        a.put("bbb",3);
        a.put("bbb",4);
        a.put("bbb",5);

        Object[] values = a.getEntry("aaa");
        assertEquals(values[0],13);
        assertEquals(values[3],19);

        values = a.getEntry("bbb");
        assertEquals(values[0],1);
        assertEquals(values[4],5);

        a.remove("bbb");

        values = a.getEntry("bbb");
        assertNull(values);

        values = a.getEntry("aaa");
        assertEquals(values[0],13);
        assertEquals(values[3],19);
    }

}