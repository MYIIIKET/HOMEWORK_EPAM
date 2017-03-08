package com.mylllket_inc.app;

import junit.framework.TestCase;

public class DirectoryExplorerTest extends TestCase {
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