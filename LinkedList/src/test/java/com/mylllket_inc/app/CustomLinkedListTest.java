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

    @Test
    public void testThatWeCanGetSizeAfterInsertion() {
        CustomLinkedList a = new CustomLinkedList();
        a.add(5);
        assertEquals(1, a.size());
    }

    @Test
    public void testThatSizeWontChangeAfterInsertionOfTheSameElement() {
        CustomLinkedList a = new CustomLinkedList();
        a.add(5);
        a.add(5);
        assertEquals(1, a.size());
    }

    @Test
    public void testThatSizeWorksCorrectlyAfterInsertionOfTenDifferentElements() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(10, a.size());
    }

    @Test
    public void testThatWeCanCheckOnValueContainingInList() {
        CustomLinkedList a = new CustomLinkedList();
        a.add(5);
        assertTrue(a.contains(5));
    }

    @Test
    public void testThatWeCanCheckOnValueThatIsntContainingInList() {
        CustomLinkedList a = new CustomLinkedList();
        assertFalse(a.contains(5));
    }

    @Test
    public void testThatWeCanGetAnArrayOfElementsInList() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        Object[] array = a.toArray();
        assertNotNull(array);
    }

    @Test
    public void testThatGettingElementAfterGettingAnArrayFromListWorksCorrectly() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        Object[] array = a.toArray();
        assertEquals(0, array[0]);
        assertEquals(9, array[9]);
    }

    @Test
    public void testThatWeCanRemoveOneElementInList() {
        CustomLinkedList a = new CustomLinkedList();
        a.add(5);
        a.remove((Object) 5);
        assertEquals(0, a.size());
    }

    @Test
    public void testThatWeDontHaveDeletedElementAnyMore() {
        CustomLinkedList a = new CustomLinkedList();
        a.add(5);
        a.remove((Object) 5);
        assertFalse(a.contains(5));
    }

    @Test
    public void testThatWeCanDeleteElementFromMiddle() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(10, a.size());
        a.remove((Object) 4);
        assertFalse(a.contains(4));
        assertEquals(9, a.size());
    }

    @Test
    public void testThatWeCanClearList() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(10, a.size());
        a.clear();
        assertEquals(0, a.size());
    }

    @Test
    public void testThatWeCanGetElementByIndex() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(3, a.get(4));
    }

    @Test
    public void testThatWeCantGetElementByIndexThatLessThanZero() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertNull(a.get(-1));
    }

    @Test
    public void testThatWeCantGetElementByIndexThatMoreThanNumberOfAllElements() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertNull(a.get(11));
    }

    @Test
    public void testThatWeCanGetLastAndFirstElementsByIndex() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(0, a.get(1));
        assertEquals(9, a.get(10));
    }

    @Test
    public void testThatWeCanUpdateElemetnByIndex() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(2, a.get(3));
        assertTrue(a.contains(2));
        assertNotNull(a.set(3, 5));
        assertEquals(5, a.get(3));
        assertFalse(a.contains(2));
    }

    @Test
    public void testThatWeCanUpdateFirstElemetnsByIndex() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(0, a.get(1));
        assertTrue(a.contains(0));
        assertNotNull(a.set(1, 11));
        assertEquals(11, a.get(1));
        assertFalse(a.contains(0));
    }

    @Test
    public void testThatWeCanUpdateLastElemetnsByIndex() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(9, a.get(10));
        assertTrue(a.contains(9));
        assertNotNull(a.set(10, 11));
        assertEquals(11, a.get(10));
        assertFalse(a.contains(9));
    }

}