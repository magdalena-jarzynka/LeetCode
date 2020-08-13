package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/merge-two-sorted-lists/">Merge Two Sorted Lists</a>
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode currentNode = resultNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }
        if (l1 == null) {
            currentNode.next = l2;
        } else {
            currentNode.next = l1;
        }
        return resultNode.next;
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
