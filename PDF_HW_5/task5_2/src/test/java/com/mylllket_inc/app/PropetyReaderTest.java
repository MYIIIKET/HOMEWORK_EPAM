package com.mylllket_inc.app;

import com.mylllket_inc.app.Exceptions.NoKeyException;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;


public class PropetyReaderTest {
    public void testRead() throws Exception {
        PropetyReader a = new PropetyReader("src/main/java/com/mylllket_inc/app/SomeInfo.properties");
        String keys = a.read();
        System.out.println(keys);
    }

    @Test(expected = NoKeyException.class)
    public void testNoKeyException() throws NoKeyException, IOException {
        PropetyReader a = new PropetyReader("src/main/java/com/mylllket_inc/app/CorruptedFile.properties");
        String keys = a.read();
        System.out.println(keys);
    }

}