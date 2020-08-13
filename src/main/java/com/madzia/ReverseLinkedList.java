package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/reverse-linked-list/">Reverse Linked List</a>
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode previousHead = null;
        ListNode currentHead = null;
        while (head != null) {
            currentHead = new ListNode();
            currentHead.val = head.val;
            currentHead.next = previousHead;
            previousHead = currentHead;
            head = head.next;
        }
        return currentHead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
