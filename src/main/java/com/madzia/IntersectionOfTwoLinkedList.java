package com.madzia;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution for <a href="https://leetcode.com/problems/intersection-of-two-linked-lists/">Intersection Of Two Linked List</a>
 */
public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> setA = new HashSet<>();
        while (headA != null) {
            setA.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (setA.contains(headB)) {
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
