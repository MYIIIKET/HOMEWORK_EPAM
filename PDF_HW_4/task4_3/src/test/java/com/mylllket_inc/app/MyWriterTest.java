package com.mylllket_inc.app;

import junit.framework.TestCase;


public class MyWriterTest extends TestCase {
    public void testWrite() throws Exception {
        MyWriter writer = new MyWriter();
        MyReader reader = new MyReader();
        String textUTF8 = reader.read("./src/main/java/com/mylllket_inc/app/text.utf8");
        writer.write("./src/main/java/com/mylllket_inc/app/","text.utf16",textUTF8);
    }

}