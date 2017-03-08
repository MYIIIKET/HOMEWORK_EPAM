package com.mylllket_inc.app;

import com.mylllket_inc.app.API.DirectoryExplorer;
import com.mylllket_inc.app.Exceptions.NoSuchDirectoryException;
import junit.framework.TestCase;

public class DirectoryExplorerTest extends TestCase {
    public void testCreateFile() throws Exception {
        DirectoryExplorer.setCurrentDirectory("src/main/java/com/mylllket_inc/app/Data");
        DirectoryExplorer.createFile("azaza");
        System.out.println(DirectoryExplorer.getCurrentDirectoryList());
    }

    public void testGetCurrentDirectoryList() {
        System.out.println(DirectoryExplorer.getCurrentDirectoryList());
    }

    public void testSetCurrentDirectory() throws NoSuchDirectoryException {
        System.out.println(DirectoryExplorer.getCurrentDirectory());
        System.out.println(DirectoryExplorer.getCurrentDirectoryList());

        assertTrue(DirectoryExplorer.setCurrentDirectory(".idea"));

        System.out.println(DirectoryExplorer.getCurrentDirectory());
        System.out.println(DirectoryExplorer.getCurrentDirectoryList());
    }

    public void testGetCurrentDirectory() {
        System.out.println(DirectoryExplorer.getCurrentDirectory());
    }

}