package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    void testLinkedListWithManyElements() {
        //Given
        ReverseLinkedList.ListNode listNode1 = new ReverseLinkedList.ListNode(1);
        ReverseLinkedList.ListNode listNode2 = new ReverseLinkedList.ListNode(2);
        ReverseLinkedList.ListNode listNode3 = new ReverseLinkedList.ListNode(3);
        ReverseLinkedList.ListNode listNode4 = new ReverseLinkedList.ListNode(4);
        ReverseLinkedList.ListNode listNode5 = new ReverseLinkedList.ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        //When
        ReverseLinkedList.ListNode resultNode = reverseLinkedList.reverseList(listNode1);

        //Then
        assertEquals(5, resultNode.val);
        resultNode = resultNode.next;
        assertEquals(4, resultNode.val);
        resultNode = resultNode.next;
        assertEquals(3, resultNode.val);
        resultNode = resultNode.next;
        assertEquals(2, resultNode.val);
        resultNode = resultNode.next;
        assertEquals(1, resultNode.val);

    }

    @Test
    void testLinkedListWithOneElement() {
        //Given
        ReverseLinkedList.ListNode listNode1 = new ReverseLinkedList.ListNode(1);

        //When
        ReverseLinkedList.ListNode resultNodeNext = reverseLinkedList.reverseList(listNode1);

        //Then
        assertEquals(1, resultNodeNext.val);
    }


    @Test
    void testEmptyLinkedList() {
        //Given
        ReverseLinkedList.ListNode listNode1 = null;

        //When
        ReverseLinkedList.ListNode resultNodeNext = reverseLinkedList.reverseList(listNode1);

        //Then
        assertNull(resultNodeNext);
    }
}