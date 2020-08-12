package com.madzia;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            stack.push(currentNode.val);
            currentNode = currentNode.next;
        }
        while (head != null) {
            if (head.val == stack.peek()) {
                stack.pop();
                head = head.next;
            } else {
                return false;
            }
        }
        return stack.empty();
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
