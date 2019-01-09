package com.zhanghongze.learning.algorithms.list;

import org.junit.Test;

public class SingleLinkedListTest {


    @Test
    public void addFirst(){
        String [] array = {"b","c","d","e"};

        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<String>(array);
        System.out.println(singleLinkedList.toString());

        singleLinkedList.addFirst("a");
        System.out.println(singleLinkedList.toString());
    }

    @Test
    public void addLast(){
        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<String>();

        singleLinkedList.addLast("a");
        System.out.println(singleLinkedList.toString());
    }

    @Test
    public void reverse(){
        String [] array = {"b"};

        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<String>(array);
        singleLinkedList.reverse();
        System.out.println(singleLinkedList.toString());

        singleLinkedList.addLast("f");
        System.out.println(singleLinkedList.toString());

        singleLinkedList.addLast("e");
        singleLinkedList.reverse();
        System.out.println(singleLinkedList.toString());
    }

    @Test
    public void set(){
        SingleLinkedList<String> listOne = new SingleLinkedList<String>(new String []{"a","d","f","i","j","k","l"});
        listOne.set(6,"e");
        System.out.println(listOne.toString());
    }

    @Test
    public void middle(){
        SingleLinkedList<String> listOne = new SingleLinkedList<String>(new String []{"a","b"});
        System.out.println(listOne.middle().item);

        listOne.addLast("c");
        System.out.println(listOne.middle().item);

        listOne.addLast("d");
        System.out.println(listOne.middle().item);

        listOne.addLast("e");
        System.out.println(listOne.middle().item);

    }

    @Test
    public void merge(){
        SingleLinkedList<String> listOne = new SingleLinkedList<String>(new String []{"a","d","f","i","j","k","l"});
        SingleLinkedList<String> listTwo = new SingleLinkedList<String>(new String []{"b","c","e","g","h"});

        SingleLinkedList.Node<String> p = listOne.getHead().next;//第一个数据Node
        SingleLinkedList.Node<String> q = listTwo.getHead().next;//第一个数据Node

        SingleLinkedList<String> listThree = new SingleLinkedList<String>();
        while(p!= null || q!=null){
            if(p != null && q!= null) {
                if (p.item.compareTo(q.item) <= 0) {
                    listThree.addLast(p.item);
                    p = p.next;
                } else {
                    listThree.addLast(q.item);
                    q = q.next;
                }
            }else if(p != null){
                listThree.addLast(p.item);
                p = p.next;
            }else if(q != null){
                listThree.addLast(q.item);
                q = q.next;
            }
        }

        System.out.println(listThree.toString());
    }
}
