package com.mylllket_inc.app;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class CustomTreeMapTest {

    @Test
    public void testThatWeCanCreateCustomTreeMap() throws Exception {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a);
    }

    @Test
    public void testThatWeCanPut() {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a.put("aaa", 13));
    }

    @Test
    public void testThatWeCanPutToTheLeft() {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a.put("aaa", 13));
        assertNotNull(a.put("bbb", 13));
    }

    @Test
    public void testThatWeCanPutToTheRight() {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a.put("bbb", 13));
        assertNotNull(a.put("aaa", 13));
    }

    @Test
    public void testThatWeCanPutTheSameNode() {
        CustomTreeMap a = new CustomTreeMap();
        assertNotNull(a.put("aaa", 13));
        assertNotNull(a.put("aaa", 13));
    }

    @Test
    public void testThatWeCanPutManyRandomElements() {
        Random random = new Random();
        CustomTreeMap a = new CustomTreeMap();
        for (int i = 0; i < 10; i++) {
            assertNotNull(a.put(random.nextInt(5) + 1, random.nextInt(6) + 5));
        }
    }

    @Test
    public void testThatTreeCanBeEmpty() {
        CustomTreeMap a = new CustomTreeMap();
        assertTrue(a.isEmpty());
    }

    @Test
    public void testThatTreeCantBeEmpty() {
        CustomTreeMap a = new CustomTreeMap();
        a.put("aaa", 13);
        assertFalse(a.isEmpty());
    }

    @Test
    public void testThatSizeOfTheTreeCanBeZero() {
        CustomTreeMap a = new CustomTreeMap();
        assertEquals(a.size(), 0);
    }

    @Test
    public void testThatSizeOfTheTreeCanBeGreaterThanZero() {
        CustomTreeMap a = new CustomTreeMap();
        a.put("aaa", 1);
        assertTrue(a.size() > 0);
    }

    @Test
    public void testThatWeCanCheckOnKeyContaining() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(5, 1);
        a.put(4, 4);
        a.put(7, 5);
        a.put(2, 3);
        a.put(3, 11);
        a.put(8, 4);
        a.put(6, 6);
        a.put(1, 2);
        a.put(9, 4);
        a.put(10, 6);
        assertTrue(a.containsKey(3));
    }

    @Test
    public void testThatWeCantContainKey() {
        CustomTreeMap a = new CustomTreeMap();
        assertFalse(a.containsKey(3));
    }

    @Test
    public void testThatColoringIsCorrectWhenWeHaveOnlyTwoChildren() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(5, 1);
        a.put(4, 1);
        a.put(7, 1);
        assertTrue(a.getColorByKey(4));
        assertTrue(a.getColorByKey(7));
        assertFalse(a.getColorByKey(5));
    }

    @Test
    public void testThatColoringIsCorrectWhenParentAndUncleAreRedAndPutElementToTheLeftBranch() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(5, 1);
        a.put(4, 1);
        a.put(7, 1);
        a.put(2, 1);
        assertTrue(a.getColorByKey(2));
        assertFalse(a.getColorByKey(4));
        assertFalse(a.getColorByKey(7));
        assertFalse(a.getColorByKey(5));
    }

    @Test
    public void testThatColoringIsCorrectWhenParentAndUncleAreRedAndPutElementToTheRightBranch() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(5, 1);
        a.put(4, 1);
        a.put(7, 1);
        a.put(8, 1);
        assertTrue(a.getColorByKey(8));
        assertFalse(a.getColorByKey(4));
        assertFalse(a.getColorByKey(7));
        assertFalse(a.getColorByKey(5));
    }

    @Test
    public void testThatColoringAndRotatingAreCorrectWhenUncleIsBlackWePutElementToTheLeftBranchAsLeftLeaf() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(5, 1);
        a.put(4, 1);
        a.put(7, 1);
        a.put(2, 1);
        a.put(1, 1);
        assertFalse(a.getColorByKey(5));
        assertEquals(a.getParentByKey(5), null);
        assertEquals(a.getRightChildByKey(5), 7);
        assertEquals(a.getLeftChildByKey(5), 2);

        assertFalse(a.getColorByKey(2));
        assertEquals(a.getParentByKey(2), 5);
        assertEquals(a.getRightChildByKey(2), 4);
        assertEquals(a.getLeftChildByKey(2), 1);

        assertTrue(a.getColorByKey(1));
        assertEquals(a.getParentByKey(1), 2);
        assertEquals(a.getRightChildByKey(1), null);
        assertEquals(a.getLeftChildByKey(1), null);

        assertTrue(a.getColorByKey(4));
        assertEquals(a.getParentByKey(4), 2);
        assertEquals(a.getRightChildByKey(4), null);
        assertEquals(a.getLeftChildByKey(4), null);
    }


    @Test
    public void testThatColoringAndRotatingAreCorrectWhenUncleIsBlackWePutElementToTheRightBranchAsRightLeaf() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(5, 1);
        a.put(4, 1);
        a.put(7, 1);
        a.put(8, 1);
        a.put(9, 1);
        assertFalse(a.getColorByKey(5));
        assertEquals(a.getParentByKey(5), null);
        assertEquals(a.getRightChildByKey(5), 8);
        assertEquals(a.getLeftChildByKey(5), 4);

        assertFalse(a.getColorByKey(4));
        assertEquals(a.getParentByKey(4), 5);
        assertEquals(a.getRightChildByKey(4), null);
        assertEquals(a.getLeftChildByKey(4), null);

        assertTrue(a.getColorByKey(7));
        assertEquals(a.getParentByKey(7), 8);
        assertEquals(a.getRightChildByKey(7), null);
        assertEquals(a.getLeftChildByKey(7), null);

        assertTrue(a.getColorByKey(9));
        assertEquals(a.getParentByKey(9), 8);
        assertEquals(a.getRightChildByKey(9), null);
        assertEquals(a.getLeftChildByKey(9), null);

        assertFalse(a.getColorByKey(8));
        assertEquals(a.getParentByKey(8), 5);
        assertEquals(a.getRightChildByKey(8), 9);
        assertEquals(a.getLeftChildByKey(8), 7);
    }


    @Test
    public void testThatColoringAndRotatingAreCorrectWhenThereAreThreeEmementsOnTheRightBranch() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(5, 1);
        a.put(6, 1);
        a.put(7, 1);
        assertFalse(a.getColorByKey(6));
        assertEquals(a.getParentByKey(6), null);
        assertEquals(a.getRightChildByKey(6), 7);
        assertEquals(a.getLeftChildByKey(6), 5);

        assertTrue(a.getColorByKey(5));
        assertEquals(a.getParentByKey(5), 6);
        assertEquals(a.getRightChildByKey(5), null);
        assertEquals(a.getLeftChildByKey(5), null);

        assertTrue(a.getColorByKey(7));
        assertEquals(a.getParentByKey(7), 6);
        assertEquals(a.getRightChildByKey(7), null);
        assertEquals(a.getLeftChildByKey(7), null);
    }

    @Test
    public void testThatColoringAndRotatingAreCorrectWhenThereAreThreeEmementsOnTheLeftBranch() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(5, 1);
        a.put(4, 1);
        a.put(3, 1);
        assertFalse(a.getColorByKey(4));
        assertEquals(a.getParentByKey(4), null);
        assertEquals(a.getRightChildByKey(4), 5);
        assertEquals(a.getLeftChildByKey(4), 3);

        assertTrue(a.getColorByKey(5));
        assertEquals(a.getParentByKey(5), 4);
        assertEquals(a.getRightChildByKey(5), null);
        assertEquals(a.getLeftChildByKey(5), null);

        assertTrue(a.getColorByKey(3));
        assertEquals(a.getParentByKey(3), 4);
        assertEquals(a.getRightChildByKey(3), null);
        assertEquals(a.getLeftChildByKey(3), null);
    }

    @Test
    public void test() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(9, 1);
        a.put(8, 1);
        a.put(7, 1);
        a.put(6, 1);
        a.put(5, 1);
        a.put(4, 1);
        a.put(3, 1);
        a.put(2, 1);

        assertFalse(a.getColorByKey(9));
        assertEquals(a.getParentByKey(9), 8);
        assertEquals(a.getRightChildByKey(9), null);
        assertEquals(a.getLeftChildByKey(9), null);

        assertFalse(a.getColorByKey(8));
        assertEquals(a.getParentByKey(8), 6);
        assertEquals(a.getRightChildByKey(8), 9);
        assertEquals(a.getLeftChildByKey(8), 7);

        assertFalse(a.getColorByKey(7));
        assertEquals(a.getParentByKey(7), 8);
        assertEquals(a.getRightChildByKey(7), null);
        assertEquals(a.getLeftChildByKey(7), null);

        assertFalse(a.getColorByKey(6));
        assertEquals(a.getParentByKey(6), null);
        assertEquals(a.getRightChildByKey(6), 8);
        assertEquals(a.getLeftChildByKey(6), 4);

        assertFalse(a.getColorByKey(5));
        assertEquals(a.getParentByKey(5), 4);
        assertEquals(a.getRightChildByKey(5), null);
        assertEquals(a.getLeftChildByKey(5), null);

        assertFalse(a.getColorByKey(4));
        assertEquals(a.getParentByKey(4), 6);
        assertEquals(a.getRightChildByKey(4), 5);
        assertEquals(a.getLeftChildByKey(4), 3);

        assertFalse(a.getColorByKey(3));
        assertEquals(a.getParentByKey(3), 4);
        assertEquals(a.getRightChildByKey(3), null);
        assertEquals(a.getLeftChildByKey(3), 2);

        assertTrue(a.getColorByKey(2));
        assertEquals(a.getParentByKey(2), 3);
        assertEquals(a.getRightChildByKey(2), null);
        assertEquals(a.getLeftChildByKey(2), null);


    }

    @Test
    public void test2() {
        CustomTreeMap a = new CustomTreeMap();
        a.put(9, 1);
        a.put(8, 1);
        a.put(7, 1);
        a.put(6, 1);
        a.put(5, 1);
        a.put(4, 1);
        a.put(3, 1);
        a.put(2, 1);

        assertFalse(a.getColorByKey(6));
        assertEquals(a.getParentByKey(6), null);
        assertEquals(a.getRightChildByKey(6), 8);
        assertEquals(a.getLeftChildByKey(6), 4);

        assertTrue(a.getColorByKey(4));
        assertEquals(a.getParentByKey(4), 6);
        assertEquals(a.getRightChildByKey(4), 5);
        assertEquals(a.getLeftChildByKey(4), 3);

        assertFalse(a.getColorByKey(3));
        assertEquals(a.getParentByKey(3), 4);
        assertEquals(a.getRightChildByKey(3), null);
        assertEquals(a.getLeftChildByKey(3), 2);

        assertFalse(a.getColorByKey(5));
        assertEquals(a.getParentByKey(5), 4);
        assertEquals(a.getRightChildByKey(5), null);
        assertEquals(a.getLeftChildByKey(5), null);

        assertTrue(a.getColorByKey(2));
        assertEquals(a.getParentByKey(2), 3);
        assertEquals(a.getRightChildByKey(2), null);
        assertEquals(a.getLeftChildByKey(2), null);

//        assertTrue(a.getColorByKey(8));
//        assertEquals(a.getParentByKey(8), 6);
//        assertEquals(a.getRightChildByKey(8), 9);
//        assertEquals(a.getLeftChildByKey(8), 7);

        assertFalse(a.getColorByKey(9));
        assertEquals(a.getParentByKey(9), 8);
        assertEquals(a.getRightChildByKey(9), null);
        assertEquals(a.getLeftChildByKey(9), null);

//        assertTrue(a.getColorByKey(7));
//        assertEquals(a.getParentByKey(7), 8);
//        assertEquals(a.getRightChildByKey(7), null);
//        assertEquals(a.getLeftChildByKey(7), null);
    }


}