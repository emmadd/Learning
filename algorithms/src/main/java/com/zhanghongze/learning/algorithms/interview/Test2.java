package com.zhanghongze.learning.algorithms.interview;

public class Test2 {

    public static void main(String [] args){
        Node a1 = new Node();
        a1.data = 4;

        Node a2 = new Node();
        a2.data= 6;
        a1.next = a2;

        Node a3 = new Node();
        a3.data=3;
        a2.next = a3;


        Node b1 = new Node();
        b1.data = 9;

        Node b2 = new Node();
        b2.data= 8;
        b1.next = b2;

        Node b3 = new Node();
        b3.data=7;
        b2.next = b3;

        Test2 test2 = new Test2();
        Node res = test2.plus(a1, b1);

        while (res != null){
            System.out.println(res.data);
            res = res.next;
        }

    }


    public Node plus(Node n1, Node n2){
        Node dummyHead = new Node();
        Node current = dummyHead;
        int x = 0;
        while (n1 != null || n2 != null){
            int sum = 0;
            if(n1 != null){
                sum = sum+n1.data;
                n1 = n1.next;
            }
            if(n2 != null){
                sum = sum +n2.data;
                n2 = n2.next;
            }

            int data = (x+sum) % 10;
            x = (x + sum) / 10;

            Node  node = new Node();
            node.data = data;

            current.next = node;
            current = current.next;
        }

        if(x >0){
            Node  node = new Node();
            node.data = x;

            current.next = node;
        }

        return dummyHead.next;
    }

    public static class Node{
        public int data;
        public Node next;
    }
}
