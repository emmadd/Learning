package com.zhanghongze.learning.algorithms.list;


public class SingleLinkedList<E> {

    private Node head = new Node<E>();

    private volatile int size = 0;

    public Node<E> getHead(){
        return head;
    }

    public SingleLinkedList() {
    }

    // 以结点元素构造单链表
    public SingleLinkedList(E[] element){
        Node<E> prev = head;
        for (int i = 0; i< element.length;i++){
            Node<E> node = new Node<E>();
            node.item = element[i];
            prev.next = node;

            prev = node;
        }

        size = element.length;
    }

    public void addLast(E e){
        Node<E> p = head;
        while(p.next != null) {
            p = p.next;
        };

        Node<E> newNode = new Node<E>();
        newNode.item = e;

        p.next = newNode;

        size++;
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<E>();
        newNode.item = e;
        newNode.next = head.next;

        head.next = newNode;

        size++;
    }

    public void set(int i, E e){
        if(i < 0){
            throw new IndexOutOfBoundsException("链表没有第"+i+"个元素");
        }
        if(size < i){
            throw new IndexOutOfBoundsException("链表没有第"+i+"个元素");
        }

        Node<E> p = head.next;
        for(int j =0;j<i; j++){
            p = p.next;
        }
        p.item = e;
    }

    /**
     * 获取链表中间节点
     * @return
     */
    public Node<E> middle(){
        if(head.next == null){
            return null;
        }
        if(head.next.next == null){
            return head.next;
        }
        Node<E> p = head.next;
        Node<E> q = head.next.next;

        while (q != null){
            if(q.next == null){
                break;
            }
            p = p.next;
            q = q.next.next;
        }

        return p;
    }

    /**
     * 单链表反转
     */
    public void reverse(){
        Node<E> p = null;
        Node<E> q = null;
        Node<E> r = null;

        if(head.next == null){
            return ;
        }

        if(head.next.next == null){
            return ;
        }

        p = head.next;
        r = q = head.next.next;

        p.next = null;

        while (q != null){
            r = q.next;
            q.next = p;
            p = q;
            q = r;
        }

        head.next = p ;
    }


    public static class Node<E> {
        E item;

        SingleLinkedList.Node<E> next;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<E> p = head;
        while(p.next != null){
            sb.append(p.next.item).append(",");
            p = p.next;
        }
        return sb.toString();
    }
}
