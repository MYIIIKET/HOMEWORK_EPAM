package com.mylllket_inc.app;

import junit.framework.TestCase;


public class MyReaderTest extends TestCase {
    public void testRead() throws Exception {
        MyReader reader = new MyReader();
        String text = reader.read("./src/main/java/com/mylllket_inc/app/text.utf8");
        System.out.println(text);
    }

}