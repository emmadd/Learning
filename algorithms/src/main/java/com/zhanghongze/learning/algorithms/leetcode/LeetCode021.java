package com.zhanghongze.learning.algorithms.leetcode;

import com.zhanghongze.learning.algorithms.leetcode.common.ListNode;

public class LeetCode021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        current.next = l1!= null? l1: l2;

        return head.next;
    }
}
