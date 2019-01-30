package com.zhanghongze.learning.algorithms.string;

/**
 * https://github.com/julycoding/The-Art-Of-Programming-By-July/blob/master/ebook/zh/01.01.md
 */
public class StringRotate {

    public static class Node {
        char data;
        Node next;

        public Node(char data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void reverseString(char [] arr, int from, int to){
        if(arr.length <=1){
            return;
        }

        while(from<to){
            char t = arr[from];
            arr[from++] = arr [to];
            arr[to--] = t;
        }
    }

    public static void leftRotateString(char [] arr, int n, int m){
        reverseString(arr,0, m-1);
        reverseString(arr, m, n-1);
        reverseString(arr, 0, n-1);
    }

    public static Node reverseLinkList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node p = head;
        while (p.next != null){
            Node q = p.next;
            p.next = q.next;
            q.next = head;
            head = q;
        }
        return head;
    }

    public static void reverseWord(char [] arr){
        if(arr.length<=1){
            return;
        }

        int from = 0;
        int to = from;

        while (to<arr.length-1){
            to++;
            if (arr[to] != ' '){
                continue;
            }else {
                reverseString(arr, from, to-1);
                from = to+1;
            }

            for(char c : arr){
                System.out.print(c);
            }
            System.out.print("\n");

        }

        if(from<=to){
            reverseString(arr, from, to);
        }

        reverseString(arr, 0, arr.length-1);
    }

    public static void main(String [] args){
        String s = "abcd";
        char [] arr = s.toCharArray();
        reverseString(arr, 0, arr.length-1);

        for(char c : arr){
            System.out.print(c);
        }
        System.out.print("\n");

        String s2 = "abcdef";
        char [] arr2 = s2.toCharArray();
        leftRotateString(arr2,6, 3);
        for(char c : arr2){
            System.out.print(c);
        }

        System.out.print("\n");

//        Node nodeA = new Node('a', new Node('b', new Node('c', new Node('d', null))));
        Node nodeA = new Node('a', new Node('b',null));

        Node p = nodeA;
        while(p != null){
            System.out.print(p.data);
            p = p.next;
        }

        System.out.print("\n");

        Node q = reverseLinkList(nodeA);

        while(q != null){
            System.out.print(q.data);
            q = q.next;
        }

        System.out.print("\nreverseWord:");

        String s3 ="I am a student.";
        char [] c3= s3.toCharArray();
        reverseWord(c3);

        for(char c : c3){
            System.out.print(c);
        }
    }
}
