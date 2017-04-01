package com.mylllket_inc.app;


import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

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

    @Test
    public void testThatWeCanInsertElemetnByIndex() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.add(2, 11);
        assertTrue(a.contains(11));
        assertEquals(11, a.get(2));
    }

    @Test
    public void testThatWeCanRemoveElemetnByIndex() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertTrue(a.contains(2));
        assertEquals(2, a.remove(3));
        assertFalse(a.contains(2));
    }

    @Test
    public void testThatWeCanGetIndexByElement() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(0, a.indexOf(0));
        assertEquals(9, a.indexOf(9));
        assertEquals(-1, a.indexOf(11));
    }

    @Test
    public void testThatWeCanGetLastIndexByElement() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.add(9, 5);
        assertEquals(11, a.size());
        assertEquals(9, a.lastIndexOf(5));
    }

    @Test
    public void testThatWeCantGetLastIndexByElementIsThereIsNoOne() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertEquals(-1, a.lastIndexOf(11));
    }

    @Test
    public void testThatWeCanGetDefaultListIterator() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertNotNull(a.listIterator());
    }

    @Test
    public void testThatWeCanGetListIteratorUsingIndex() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        assertNotNull(a.listIterator(5));
    }

    @Test
    public void testThatWeCanUseMethodsOfDefaultListIterator() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        ListIterator b = a.listIterator();
        assertTrue(b.hasNext());
        assertTrue(b.hasPrevious());
        assertEquals(1, b.next());
        assertEquals(null, b.previous());
        assertEquals(2, b.nextIndex());
        assertEquals(0, b.previousIndex());

        assertTrue(a.contains(0));
        b.remove();
        assertFalse(a.contains(0));

        assertFalse(a.contains(11));
        b.set(11);
        assertTrue(a.contains(11));

        assertFalse(a.contains(12));
        b.add(12);
        assertTrue(a.contains(12));
    }

    @Test
    public void testThatWeCanUseMethodsOfListIterator() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        ListIterator b = a.listIterator(5);
        assertTrue(b.hasNext());
        assertTrue(b.hasPrevious());
        assertEquals(6, b.next());
        assertEquals(4, b.previous());
        assertEquals(7, b.nextIndex());
        assertEquals(5, b.previousIndex());

        assertTrue(a.contains(5));
        b.remove();
        assertFalse(a.contains(5));

        assertFalse(a.contains(11));
        b.set(11);
        assertTrue(a.contains(11));

        assertFalse(a.contains(12));
        b.add(12);
        assertTrue(a.contains(12));
    }

    @Test
    public void testThatWeCanGetIterator() {
        CustomLinkedList a = new CustomLinkedList();
        Iterator b = a.iterator();
        assertNotNull(b);
    }

    @Test
    public void testThatWeCanUseMethodsOfIterator() {
        CustomLinkedList a = new CustomLinkedList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        Iterator b = a.iterator();
        assertTrue(b.hasNext());
        assertEquals(1, b.next());

        assertTrue(a.contains(1));
        b.remove();
        assertFalse(a.contains(1));
    }

    @Test
    public void testThatListCanContainCollection() {
        CustomLinkedList a = new CustomLinkedList();
        List b = new ArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
            b.add(i);
        }
        b.remove(5);
        assertTrue(a.containsAll(b));
    }

    @Test
    public void testThatListCantContainCollection() {
        CustomLinkedList a = new CustomLinkedList();
        List b = new ArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
            b.add(i);
        }
        b.add(11);
        assertFalse(a.containsAll(b));
    }

    @Test
    public void testThatWeCanAddCollectionToOurList() {
        CustomLinkedList a = new CustomLinkedList();
        List b = new ArrayList();
        for (int i = 0; i < 10; i++) {
            b.add(i);
        }
        a.addAll(b);
        for (int i = 0; i < 10; i++) {
            assertTrue(a.contains(i));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantAddNullCollectionToOurList() {
        CustomLinkedList a = new CustomLinkedList();
        List b = null;
        a.addAll(b);
    }

    @Test
    public void testThatWeCanAddCollectionToOurListFromIndex() {
        CustomLinkedList a = new CustomLinkedList();
        List b = new ArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        for (int i = 10; i < 20; i++) {
            b.add(i);
        }
        a.addAll(5, b);
        for (int i = 0; i < 20; i++) {
            assertTrue(a.contains(i));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantAddNullCollectionToOurListFromIndex() {
        CustomLinkedList a = new CustomLinkedList();
        List b = null;
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.addAll(5, b);
    }

    @Test
    public void testThatWeCanRemoveAllElementsOfCollectionFromOurList() {
        CustomLinkedList a = new CustomLinkedList();
        List b = new ArrayList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        for (int i = 0; i < 10; i++) {
            b.add(i);
        }
        a.removeAll(b);
        assertEquals(0, a.size());
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantRemoveAllElementsOfNullCollectionFromOurList() {
        CustomLinkedList a = new CustomLinkedList();
        List b = null;
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.removeAll(b);
    }

    @Test
    public void testThatWeCanRetainElementsOfCollectionInOurList() {
        CustomLinkedList a = new CustomLinkedList();
        a.add("white");
        a.add("black");
        a.add("red");

        List b = new ArrayList();
        b.add("green");
        b.add("red");
        b.add("white");

        a.retainAll(b);
        assertTrue(a.contains("white"));
        assertTrue(a.contains("red"));
        assertFalse(a.contains("black"));
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantRetainElementsOfNullCollectionInOurList() {
        CustomLinkedList a = new CustomLinkedList();
        a.add("white");
        a.add("black");
        a.add("red");

        List b = null;

        a.retainAll(b);
    }

    @Test
    public void testThatWeCanGetSubListFromOurList() {
        CustomLinkedList a = new CustomLinkedList();

        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a = (CustomLinkedList) a.subList(5, 10);

        for (int i = 0; i < 10; i++) {
            if (i > 4 && i < 10) {
                assertTrue(a.contains(i));
            } else {
                assertFalse(a.contains(i));
            }
        }
    }


}