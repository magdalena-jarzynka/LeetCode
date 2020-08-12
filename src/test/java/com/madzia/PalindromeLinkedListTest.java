package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    void shouldReturnTrueForPalindromeWithEvenNumberOfNodes() {
        //Given
        PalindromeLinkedList.ListNode listNode1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode listNode2 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode listNode3 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode listNode4 = new PalindromeLinkedList.ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        //When
        boolean result = palindromeLinkedList.isPalindrome(listNode1);

        //Then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForPalindromeWithOddNumberOfNodes() {
        //Given
        PalindromeLinkedList.ListNode listNode1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode listNode2 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode listNode3 = new PalindromeLinkedList.ListNode(3);
        PalindromeLinkedList.ListNode listNode4 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode listNode5 = new PalindromeLinkedList.ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        //When
        boolean result = palindromeLinkedList.isPalindrome(listNode1);

        //Then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenLinkedListIsNotPalindrome() {
        //Given
        PalindromeLinkedList.ListNode listNode1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode listNode2 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode listNode3 = new PalindromeLinkedList.ListNode(3);
        PalindromeLinkedList.ListNode listNode4 = new PalindromeLinkedList.ListNode(2);


        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        //When
        boolean result = palindromeLinkedList.isPalindrome(listNode1);

        //Then
        assertFalse(result);
    }

}