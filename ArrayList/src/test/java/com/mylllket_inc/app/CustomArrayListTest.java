package com.mylllket_inc.app;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.*;


public class CustomArrayListTest {

    @Test
    public void testThatWeCanCreateList() {
        CustomArrayList a = new CustomArrayList();
        assertNotNull(a);
    }

    @Test
    public void testThatWeCanGetSizeOfEmptyList() {
        CustomArrayList a = new CustomArrayList();
        assertEquals(0, a.size());
    }

    @Test
    public void testThatWeCanCheckIfListIsEmpty() {
        CustomArrayList a = new CustomArrayList();
        assertTrue(a.isEmpty());
    }

    @Test
    public void testThatWeCanCheckIfListDoesntContainsElement() {
        CustomArrayList a = new CustomArrayList();
        assertFalse(a.contains(5));
    }

    @Test
    public void testThatWeCanAddElementToTheList() {
        CustomArrayList a = new CustomArrayList();
        a.add(5);
        assertFalse(a.isEmpty());
        assertTrue(a.contains(5));
    }

    @Test
    public void testThatListSizeCanBeGreaterThanZero() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
            assertTrue(a.contains(i));
        }
        assertEquals(10, a.size());
    }

    @Test
    public void testThatListSizeCanBeGreaterThanMaxCapacity() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 11; i++) {
            a.add(i);
        }
        assertEquals(10, a.size());
    }

    @Test
    public void testThatWeCanRemoveElement() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(10, a.size());
        assertTrue(a.contains(5));
        a.remove((Object) 5);
        assertFalse(a.contains(5));
        assertEquals(9, a.size());
    }

    @Test
    public void testThatWeCanRemoveElementByIndex() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(5,a.remove(5));
    }


}