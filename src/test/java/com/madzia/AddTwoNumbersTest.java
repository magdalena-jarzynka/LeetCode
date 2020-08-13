package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void testTwoNumbersWithTheSameAmountOfDigits() {
        //Given
        AddTwoNumbers.ListNode firstListNode1 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode firstListNode2 = new AddTwoNumbers.ListNode(4);
        AddTwoNumbers.ListNode firstListNode3 = new AddTwoNumbers.ListNode(3);

        firstListNode1.next = firstListNode2;
        firstListNode2.next = firstListNode3;

        AddTwoNumbers.ListNode secondListNode1 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode secondListNode2 = new AddTwoNumbers.ListNode(6);
        AddTwoNumbers.ListNode secondListNode3 = new AddTwoNumbers.ListNode(4);

        secondListNode1.next = secondListNode2;
        secondListNode2.next = secondListNode3;

        //When
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(firstListNode1, secondListNode1);

        //Then
        assertEquals(7, result.val);
        result = result.next;
        assertEquals(0, result.val);
        result = result.next;
        assertEquals(8, result.val);
    }

    @Test
    void testTwoNumbersWithDifferentAmountOfDigits() {
        //Given
        AddTwoNumbers.ListNode firstListNode1 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode firstListNode2 = new AddTwoNumbers.ListNode(4);
        AddTwoNumbers.ListNode firstListNode3 = new AddTwoNumbers.ListNode(3);
        AddTwoNumbers.ListNode firstListNode4 = new AddTwoNumbers.ListNode(2);

        firstListNode1.next = firstListNode2;
        firstListNode2.next = firstListNode3;
        firstListNode3.next = firstListNode4;

        AddTwoNumbers.ListNode secondListNode1 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode secondListNode2 = new AddTwoNumbers.ListNode(6);

        secondListNode1.next = secondListNode2;

        //When
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(firstListNode1, secondListNode1);

        //Then
        assertEquals(7, result.val);
        result = result.next;
        assertEquals(0, result.val);
        result = result.next;
        assertEquals(4, result.val);
        result = result.next;
        assertEquals(2, result.val);

    }

    @Test
    void testAmountOfDigitsInResultBiggerThanInInputIntegers() {
        //Given
        AddTwoNumbers.ListNode firstListNode1 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode firstListNode2 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode firstListNode3 = new AddTwoNumbers.ListNode(9);

        firstListNode1.next = firstListNode2;
        firstListNode2.next = firstListNode3;

        AddTwoNumbers.ListNode secondListNode1 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode secondListNode2 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode secondListNode3 = new AddTwoNumbers.ListNode(9);

        secondListNode1.next = secondListNode2;
        secondListNode2.next = secondListNode3;

        //When
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(firstListNode1, secondListNode1);

        //Then
        assertEquals(8, result.val);
        result = result.next;
        assertEquals(9, result.val);
        result = result.next;
        assertEquals(9, result.val);
        result = result.next;
        assertEquals(1, result.val);
    }

    @Test
    void testAmountOfDigitsInResultIsTwoAndInInputIntegersIsOne() {
        //Given
        AddTwoNumbers.ListNode firstListNode1 = new AddTwoNumbers.ListNode(5);

        AddTwoNumbers.ListNode secondListNode1 = new AddTwoNumbers.ListNode(5);

        //When
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(firstListNode1, secondListNode1);

        //Then
        assertEquals(0, result.val);
        result = result.next;
        assertEquals(1, result.val);
    }


}