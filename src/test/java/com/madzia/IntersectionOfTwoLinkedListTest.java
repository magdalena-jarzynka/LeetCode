package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoLinkedListTest {

    IntersectionOfTwoLinkedList intersectionOfTwoLinkedList = new IntersectionOfTwoLinkedList();

    @Test
    void testTwoLinkedListsWithTheSameAmountOfNodes() {
        //Given
        IntersectionOfTwoLinkedList.ListNode firstListNode1 = new IntersectionOfTwoLinkedList.ListNode(4);
        IntersectionOfTwoLinkedList.ListNode firstListNode2 = new IntersectionOfTwoLinkedList.ListNode(1);
        IntersectionOfTwoLinkedList.ListNode firstListNode3 = new IntersectionOfTwoLinkedList.ListNode(8);
        IntersectionOfTwoLinkedList.ListNode firstListNode4 = new IntersectionOfTwoLinkedList.ListNode(4);
        IntersectionOfTwoLinkedList.ListNode firstListNode5 = new IntersectionOfTwoLinkedList.ListNode(5);

        firstListNode1.next = firstListNode2;
        firstListNode2.next = firstListNode3;
        firstListNode3.next = firstListNode4;
        firstListNode4.next = firstListNode5;

        IntersectionOfTwoLinkedList.ListNode secondListNode1 = new IntersectionOfTwoLinkedList.ListNode(5);
        IntersectionOfTwoLinkedList.ListNode secondListNode2 = new IntersectionOfTwoLinkedList.ListNode(6);

        secondListNode1.next = secondListNode2;
        secondListNode2.next = firstListNode3;

        //When
        IntersectionOfTwoLinkedList.ListNode result = intersectionOfTwoLinkedList.getIntersectionNode(firstListNode1, secondListNode1);

        //Then
        assertEquals(8, result.val);
    }

    @Test
    void testTwoLinkedListsWithDifferentAmountOfNodes() {
        //Given
        IntersectionOfTwoLinkedList.ListNode firstListNode1 = new IntersectionOfTwoLinkedList.ListNode(4);
        IntersectionOfTwoLinkedList.ListNode firstListNode2 = new IntersectionOfTwoLinkedList.ListNode(1);
        IntersectionOfTwoLinkedList.ListNode firstListNode3 = new IntersectionOfTwoLinkedList.ListNode(8);
        IntersectionOfTwoLinkedList.ListNode firstListNode4 = new IntersectionOfTwoLinkedList.ListNode(4);
        IntersectionOfTwoLinkedList.ListNode firstListNode5 = new IntersectionOfTwoLinkedList.ListNode(5);

        firstListNode1.next = firstListNode2;
        firstListNode2.next = firstListNode3;
        firstListNode3.next = firstListNode4;
        firstListNode4.next = firstListNode5;

        IntersectionOfTwoLinkedList.ListNode secondListNode1 = new IntersectionOfTwoLinkedList.ListNode(5);
        IntersectionOfTwoLinkedList.ListNode secondListNode2 = new IntersectionOfTwoLinkedList.ListNode(6);
        IntersectionOfTwoLinkedList.ListNode secondListNode3 = new IntersectionOfTwoLinkedList.ListNode(1);


        secondListNode1.next = secondListNode2;
        secondListNode2.next = secondListNode3;
        secondListNode3.next = firstListNode3;


        //When
        IntersectionOfTwoLinkedList.ListNode result = intersectionOfTwoLinkedList.getIntersectionNode(firstListNode1, secondListNode1);

        //Then
        assertEquals(8, result.val);
    }

    @Test
    void testTwoLinkedListsWithNoIntersection() {
        //Given
        IntersectionOfTwoLinkedList.ListNode firstListNode1 = new IntersectionOfTwoLinkedList.ListNode(2);
        IntersectionOfTwoLinkedList.ListNode firstListNode2 = new IntersectionOfTwoLinkedList.ListNode(6);
        IntersectionOfTwoLinkedList.ListNode firstListNode3 = new IntersectionOfTwoLinkedList.ListNode(4);

        firstListNode1.next = firstListNode2;
        firstListNode2.next = firstListNode3;

        IntersectionOfTwoLinkedList.ListNode secondListNode1 = new IntersectionOfTwoLinkedList.ListNode(1);
        IntersectionOfTwoLinkedList.ListNode secondListNode2 = new IntersectionOfTwoLinkedList.ListNode(5);

        secondListNode1.next = secondListNode2;

        //When
        IntersectionOfTwoLinkedList.ListNode result = intersectionOfTwoLinkedList.getIntersectionNode(firstListNode1, secondListNode1);

        //Then
        assertNull(result);
    }

}