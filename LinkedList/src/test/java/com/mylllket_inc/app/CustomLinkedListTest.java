package com.mylllket_inc.app;


import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {

    @Test
    public void testThatWeCanCreateNewLinkedList() {
        CustomLinkedList a = new CustomLinkedList();
        assertNotNull(a);
    }

    @Test
    public void testThatWeCanGetSizeOfEmptyList() {
        CustomLinkedList a = new CustomLinkedList();
        assertEquals(0, a.size());
    }

    @Test
    public void testThatWeCanKnowIfListIsEmpty() {
        CustomLinkedList a = new CustomLinkedList();
        assertTrue(a.isEmpty());
    }

    @Test
    public void testThatWeCanAddElementToList() {
        CustomLinkedList a = new CustomLinkedList();
        assertTrue(a.add(5));
    }

    @Test
    public void testThatWeCantAddSameElementToList() {
        CustomLinkedList a = new CustomLinkedList();
        a.add(5);
        assertFalse(a.add(5));
    }


}