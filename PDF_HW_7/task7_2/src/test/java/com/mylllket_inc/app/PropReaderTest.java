package com.mylllket_inc.app;

import junit.framework.TestCase;

public class PropReaderTest extends TestCase {
    public void testGetProperty() throws Exception {
        PropReader reader = new PropReader("Data/data.properties");
        System.out.println(reader.getProperty("a"));
    }

}