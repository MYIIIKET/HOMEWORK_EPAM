package com.mylllket_inc.app;

import junit.framework.TestCase;

public class JavaParserTest extends TestCase {
    public void testRead() throws Exception {
        JavaParser a = new JavaParser("./src/main/java/com/mylllket_inc/app/Submarine.txt");
        String text = a.read();
        JavaParser.parseJavaCode(text);
    }

}