package com.mylllket_inc.app;

import com.mylllket_inc.app.Exceptions.NoKeyException;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;


public class PropetyReaderTest {
    @Test
    public void testRead() throws Exception {
        PropetyReader a = new PropetyReader("src/main/java/com/mylllket_inc/app/SomeInfo.properties");
        HashMap keys = a.read();
        System.out.println(keys);
    }

    @Test(expected = NoKeyException.class)
    public void testNoKeyException() throws NoKeyException, IOException {
        PropetyReader a = new PropetyReader("src/main/java/com/mylllket_inc/app/CorruptedFile.properties");
        HashMap keys = a.read();
        System.out.println(keys);
    }

}