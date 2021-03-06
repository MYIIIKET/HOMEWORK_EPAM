package com.mylllket_inc.app;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

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
        for (int i = 0; i < 15; i++) {
            a.add(i);
        }
        assertEquals(15, a.size());
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
        assertEquals(5, a.remove(5));
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantRemoveNullElement() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.remove(null);
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantFindNullObject() {
        CustomArrayList a = new CustomArrayList();
        a.contains(null);
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantAddNullObject() {
        CustomArrayList a = new CustomArrayList();
        a.add(null);
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantRemoveNullObject() {
        CustomArrayList a = new CustomArrayList();
        a.remove(null);
    }

    @Test
    public void testThatWeCanClearList() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.clear();
        assertEquals(0, a.size());
    }

    @Test
    public void testThatWeCanGetElementByIndex() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(5, a.get(5));
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantSetNullElement() {
        CustomArrayList a = new CustomArrayList();
        a.set(5, null);
    }

    @Test
    public void testThatWeCantSetElementByIndexInEmptyList() {
        CustomArrayList a = new CustomArrayList();
        assertEquals(null, a.set(5, 5));
    }

    @Test
    public void testThatWeCanSetElementByIndexInFilledList() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(4, a.set(5, 5));
    }

    @Test
    public void testThatWeCanSetElementByIndexOnFirstPositionInFilledList() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(5, a.set(0, 5));
    }

    @Test
    public void testThatWeCanSetElementByIndexOnLastPositionInFilledList() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(9, a.set(10, 5));
    }

    @Test
    public void testThatWeCanInsertElementInTheMiddleOfTheList() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.add(5, 11);
        assertEquals(11, a.size());
    }

    @Test
    public void testThatWeCanInsertElementInTheFirstPositionOfTheList() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.add(0, 11);
        assertEquals(11, a.size());
    }

    @Test
    public void testThatWeCanInsertElementInTheLastPositionOfTheList() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.add(10, 11);
        assertEquals(11, a.size());
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantInsertNullElementInTheList() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.add(10, null);
    }

    @Test
    public void testThatWeCanGetIndexByElement() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(5, a.indexOf(5));
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantGetIndexByNullElement() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.indexOf(null);
    }

    @Test
    public void testThatWeCantGetIndexByElement() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(-1, a.indexOf(11));
    }

    @Test
    public void testThatWeCanGetLastIndexByElement() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.add(5);
        assertEquals(10, a.lastIndexOf(5));
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantGetLastIndexByNullElement() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.add(5);
        a.lastIndexOf(null);
    }

    @Test
    public void testThatWeCanGetNewArrayOfList() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        Object[] b = a.toArray();
        for (int i = 0; i < 10; i++) {
            assertTrue(b[i].equals(i));
        }
    }

    @Test
    public void testThatListCanContainCollectioniData() {
        CustomArrayList a = new CustomArrayList();
        List b = new ArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
            b.add(i);
        }
        assertTrue(a.containsAll(b));
    }

    @Test
    public void testThatListCantContainCollectioniData() {
        CustomArrayList a = new CustomArrayList();
        List b = new ArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
            b.add(i);
        }
        b.add(11);
        assertFalse(a.containsAll(b));
    }

    @Test(expected = NullPointerException.class)
    public void testThatListCantContainNullCollectionData() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.containsAll(null);
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantAddNullCollectionToOurList() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.addAll(null);
    }

    @Test
    public void testThatWeCanAddCollectionToOurList() {
        CustomArrayList a = new CustomArrayList();
        List b = new ArrayList();
        for (int i = 0; i < 10; i++) {
            b.add(i);
        }
        a.addAll(b);
        for (int i = 0; i < 10; i++) {
            assertTrue(a.contains((Object) i));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantAddNullCollectionToOurListFromIndex() {
        CustomArrayList a = new CustomArrayList();
        a.addAll(0, null);
    }

    @Test
    public void testThatWeCanAddCollectionToOurListFromIndex() {
        CustomArrayList a = new CustomArrayList();
        List b = new ArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        for (int i = 10; i < 20; i++) {
            b.add(i);
        }
        a.addAll(5, b);
        for (int i = 0; i < 20; i++) {
            assertTrue(a.contains((Object) i));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantRemoveNullCollectionFromOurList() {
        CustomArrayList a = new CustomArrayList();
        a.removeAll(null);
    }

    @Test
    public void testThatWeCanRemoveCollectionFromOurList() {
        CustomArrayList a = new CustomArrayList();
        List b = new ArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
            b.add(i);
        }
        a.removeAll(b);
        assertEquals(0, a.size());
    }

    @Test
    public void testThatIteratorWorksCorrectly() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        Iterator b = a.iterator();
        assertTrue(b.hasNext());
        assertEquals(1, b.next());
    }

    @Test
    public void testThatSubListWorksCorrectly() {
        CustomArrayList a = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        CustomArrayList b = (CustomArrayList) a.subList(3, 7);
        assertEquals(4, b.size());
        assertEquals(3, b.get(0));
        assertEquals(6, b.get(3));
    }


}