package com.mylllket_inc.app;

import com.sun.org.apache.xpath.internal.operations.String;
import junit.framework.TestCase;

import java.util.HashMap;

public class CustomHashMapTest extends TestCase {

    public void testThatWeCanCreateHashMap() {
        CustomHashMap a = new CustomHashMap();
    }

    public void testThatWeCanGetSize() {
        CustomHashMap a = new CustomHashMap();
        HashMap b = new HashMap();

        assertEquals(a.size(), b.size());
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

}