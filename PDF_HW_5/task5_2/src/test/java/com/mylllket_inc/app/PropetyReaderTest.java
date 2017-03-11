package com.mylllket_inc.app;

import com.mylllket_inc.app.Exceptions.NoKeyException;
import com.mylllket_inc.app.Exceptions.NoPropertiesFileException;
import junit.framework.TestCase;

import java.io.IOException;


public class PropetyReaderTest extends TestCase {
    public void testRead() throws Exception {
        PropetyReader a = new PropetyReader("src/main/java/com/mylllket_inc/app/SomeInfo.properties");
        String keys = a.read();
        System.out.println(keys);
    }

    public void testNoKeyException() throws NoKeyException, IOException {
        PropetyReader a = new PropetyReader("src/main/java/com/mylllket_inc/app/CorruptedFile.properties");
        String keys = a.read();
        System.out.println(keys);
    }

}