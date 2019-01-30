package com.zhanghongze.learning.algorithms.leetcode;

public class L002AddTwoNumbers {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int p = 0;
        while(l1!= null || l2 != null){
            int s = 0;
            if(l1 != null && l2!= null){
                s = l1.val+l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1!= null){
                s = l1.val;
                l1 = l1.next;
            }else {
                s = l2.val;
                l2 = l2.next;
            }
            int n =p + s % 10;
            p = s /10;

            ListNode node = new ListNode(n);
            current.next = node;
            current = current.next;

        }

        return head.next;
    }

    public  static void main(String [] args){
        L002AddTwoNumbers addTwoNumbers = new L002AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode sum = addTwoNumbers.addTwoNumbers(l1, l2);
        while (sum != null){
            System.out.print(sum.val+"-");
            sum = sum.next;
        }
    }


}
