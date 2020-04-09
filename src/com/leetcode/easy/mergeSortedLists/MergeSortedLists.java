package com.leetcode.easy.mergeSortedLists;
//Problem 21

import com.leetcode.common.ListNode;

public class MergeSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sorted = new ListNode(0);
        ListNode head = sorted;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                sorted.next = l1;
                l1 = l1.next;
            } else {
                sorted.next = l2;
                l2 = l2.next;
            }
            sorted = sorted.next;
        }
        if (l1 != null) {
            sorted.next = l1;
        }
        if (l2 != null) {
            sorted.next = l2;
        }
        return head.next;
    }
}
