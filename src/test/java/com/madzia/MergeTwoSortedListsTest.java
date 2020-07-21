package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    void testTwoSortedLinkedListsWithTheSameAmountOfNodes() {
        //Given
        MergeTwoSortedLists.ListNode firstListNode1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode firstListNode2 = new MergeTwoSortedLists.ListNode(2);
        MergeTwoSortedLists.ListNode firstListNode3 = new MergeTwoSortedLists.ListNode(4);

        firstListNode1.next = firstListNode2;
        firstListNode2.next = firstListNode3;

        MergeTwoSortedLists.ListNode secondListNode1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode secondListNode2 = new MergeTwoSortedLists.ListNode(3);
        MergeTwoSortedLists.ListNode secondListNode3 = new MergeTwoSortedLists.ListNode(4);

        secondListNode1.next = secondListNode2;
        secondListNode2.next = secondListNode3;

        //When
        MergeTwoSortedLists.ListNode resultNodeNext = mergeTwoSortedLists.mergeTwoLists(firstListNode1, secondListNode1);

        //Then
            assertEquals(1, resultNodeNext.val);
            resultNodeNext = resultNodeNext.next;
            assertEquals(1, resultNodeNext.val);
            resultNodeNext = resultNodeNext.next;
            assertEquals(2, resultNodeNext.val);
            resultNodeNext = resultNodeNext.next;
            assertEquals(3, resultNodeNext.val);
            resultNodeNext = resultNodeNext.next;
            assertEquals(4, resultNodeNext.val);
            resultNodeNext = resultNodeNext.next;
            assertEquals(4, resultNodeNext.val);

    }

    @Test
    void testTwoSortedLinkedListsWhenFirstListHasMoreNodes() {
        //Given
        MergeTwoSortedLists.ListNode firstListNode1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode firstListNode2 = new MergeTwoSortedLists.ListNode(3);
        MergeTwoSortedLists.ListNode firstListNode3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode firstListNode4 = new MergeTwoSortedLists.ListNode(5);
        MergeTwoSortedLists.ListNode firstListNode5 = new MergeTwoSortedLists.ListNode(7);

        firstListNode1.next = firstListNode2;
        firstListNode2.next = firstListNode3;
        firstListNode3.next = firstListNode4;
        firstListNode4.next = firstListNode5;

        MergeTwoSortedLists.ListNode secondListNode1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode secondListNode2 = new MergeTwoSortedLists.ListNode(2);
        MergeTwoSortedLists.ListNode secondListNode3 = new MergeTwoSortedLists.ListNode(6);

        secondListNode1.next = secondListNode2;
        secondListNode2.next = secondListNode3;

        //When
        MergeTwoSortedLists.ListNode resultNodeNext = mergeTwoSortedLists.mergeTwoLists(firstListNode1, secondListNode1);

        //Then
        assertEquals(1, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(1, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(2, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(3, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(4, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(5, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(6, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(7, resultNodeNext.val);

    }

    @Test
    void testTwoSortedLinkedListsWhenSecondListHasMoreNodes() {
        //Given
        MergeTwoSortedLists.ListNode firstListNode1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode firstListNode2 = new MergeTwoSortedLists.ListNode(2);
        MergeTwoSortedLists.ListNode firstListNode3 = new MergeTwoSortedLists.ListNode(4);

        firstListNode1.next = firstListNode2;
        firstListNode2.next = firstListNode3;

        MergeTwoSortedLists.ListNode secondListNode1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode secondListNode2 = new MergeTwoSortedLists.ListNode(3);
        MergeTwoSortedLists.ListNode secondListNode3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode secondListNode4 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode secondListNode5 = new MergeTwoSortedLists.ListNode(6);

        secondListNode1.next = secondListNode2;
        secondListNode2.next = secondListNode3;
        secondListNode3.next = secondListNode4;
        secondListNode4.next = secondListNode5;

        //When
        MergeTwoSortedLists.ListNode resultNodeNext = mergeTwoSortedLists.mergeTwoLists(firstListNode1, secondListNode1);

        //Then
        assertEquals(1, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(1, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(2, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(3, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(4, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(4, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(4, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(6, resultNodeNext.val);

    }

    @Test
    void testTwoSortedLinkedListsWhenFirstListIsEmpty() {
        //Given
        MergeTwoSortedLists.ListNode firstListNode1 = null;

        MergeTwoSortedLists.ListNode secondListNode1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode secondListNode2 = new MergeTwoSortedLists.ListNode(3);
        MergeTwoSortedLists.ListNode secondListNode3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode secondListNode4 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode secondListNode5 = new MergeTwoSortedLists.ListNode(6);

        secondListNode1.next = secondListNode2;
        secondListNode2.next = secondListNode3;
        secondListNode3.next = secondListNode4;
        secondListNode4.next = secondListNode5;

        //When
        MergeTwoSortedLists.ListNode resultNodeNext = mergeTwoSortedLists.mergeTwoLists(firstListNode1, secondListNode1);

        //Then
        assertEquals(1, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(3, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(4, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(4, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(6, resultNodeNext.val);

    }

    @Test
    void testTwoSortedLinkedListsWhenSecondListIsEmpty() {
        //Given
        MergeTwoSortedLists.ListNode firstListNode1 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode firstListNode2 = new MergeTwoSortedLists.ListNode(3);
        MergeTwoSortedLists.ListNode firstListNode3 = new MergeTwoSortedLists.ListNode(4);
        MergeTwoSortedLists.ListNode firstListNode4 = new MergeTwoSortedLists.ListNode(5);
        MergeTwoSortedLists.ListNode firstListNode5 = new MergeTwoSortedLists.ListNode(7);

        firstListNode1.next = firstListNode2;
        firstListNode2.next = firstListNode3;
        firstListNode3.next = firstListNode4;
        firstListNode4.next = firstListNode5;

        MergeTwoSortedLists.ListNode secondListNode1 = null;

        //When
        MergeTwoSortedLists.ListNode resultNodeNext = mergeTwoSortedLists.mergeTwoLists(firstListNode1, secondListNode1);

        //Then
        assertEquals(1, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(3, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(4, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(5, resultNodeNext.val);
        resultNodeNext = resultNodeNext.next;
        assertEquals(7, resultNodeNext.val);

    }
}