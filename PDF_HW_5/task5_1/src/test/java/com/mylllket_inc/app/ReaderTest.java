package com.mylllket_inc.app;

import com.mylllket_inc.app.API.DirectoryExplorer;
import com.mylllket_inc.app.API.Reader;
import junit.framework.TestCase;


public class ReaderTest extends TestCase {
    public void testRead() throws Exception {
        System.out.println(DirectoryExplorer.getCurrentDirectory());
        System.out.println(DirectoryExplorer.getCurrentDirectoryList());
        DirectoryExplorer.setCurrentDirectory("src/main/java/com/mylllket_inc/app/Data");
        System.out.println(DirectoryExplorer.getCurrentDirectoryList());
        Reader.read("aaa");
    }
}