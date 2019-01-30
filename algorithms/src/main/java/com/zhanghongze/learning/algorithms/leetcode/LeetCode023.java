package com.zhanghongze.learning.algorithms.leetcode;

import com.zhanghongze.learning.algorithms.leetcode.common.ListNode;

public class LeetCode023 {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length ==0){
            return null;
        }
        return mMerge(lists,0, lists.length-1);
    }

    public ListNode mMerge(ListNode[] lists, int start, int end){
        if(start>=end){
            return lists[start];
        }

        int mid = (start + end)/2;

        ListNode fistListNode = mMerge(lists, start, mid);
        ListNode secondListNode = mMerge(lists, mid+1, end);

        return mergeTwoLists(fistListNode, secondListNode);
    }

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
