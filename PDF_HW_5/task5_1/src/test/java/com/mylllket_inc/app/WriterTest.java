package com.mylllket_inc.app;

import com.mylllket_inc.app.API.DirectoryExplorer;
import com.mylllket_inc.app.API.Writer;
import junit.framework.TestCase;


public class WriterTest extends TestCase {
    public void testWrite() throws Exception {
        DirectoryExplorer.setCurrentDirectory("src/main/java/com/mylllket_inc/app/Data");
        Writer.write("azaza", "123ываа33f434f3f", false);
    }

}