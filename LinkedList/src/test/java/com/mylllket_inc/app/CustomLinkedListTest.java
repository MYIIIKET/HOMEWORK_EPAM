package com.mylllket_inc.app;


import junit.framework.TestCase;
import org.junit.Test;

public class CustomLinkedListTest extends TestCase {

    @Test
    public void testThatWeCanCreateNewLinkedList() throws Exception {
        CustomLinkedList a = new CustomLinkedList();
        assertNotNull(a);
    }

}