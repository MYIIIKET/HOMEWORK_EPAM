package com.mylllket_inc.app;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;


public class CustomTreeMapTest {
    @Test
    public void testThatWeCanCreateCustomTreeMap() throws Exception {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a);
    }

}