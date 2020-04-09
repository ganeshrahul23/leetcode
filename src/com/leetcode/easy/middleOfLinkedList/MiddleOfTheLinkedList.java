package com.leetcode.easy.middleOfLinkedList;

import com.leetcode.common.ListNode;

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        if (count == 1) return head;
        count = (count / 2) + 1;
        curr = head;

        while (count > 1) {
            curr = curr.next;
            count--;
        }
        return curr.next;
    }
}
