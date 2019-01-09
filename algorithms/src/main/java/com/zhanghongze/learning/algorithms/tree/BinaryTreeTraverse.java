package com.zhanghongze.learning.algorithms.tree;

public class BinaryTreeTraverse {

    /**
     * 递归方式实现
     *
     * @param root
     */
    public static void preOrder(Node root){
        if(root == null){
            return ;
        }

        System.out.print(root.data+",");

        preOrder(root.left);
        preOrder(root.right);
    }

    public static void middleOrder(Node root){
        if(root == null){
            return ;
        }

        middleOrder(root.left);
        System.out.print(root.data+",");
        middleOrder(root.right);
    }

    public static void main(String [] args){
        Node root = new Node(1);

        Node node2 = new Node(2);
        root.setLeft(node2);

        node2.setLeft(new Node(4));
        node2.setRight(new Node(5));

        Node node3 = new Node(3);
        root.setRight(node3);

        node3.setLeft(new Node(6));
        node3.setRight(new Node(7));

        System.out.println("\n前序遍历:");
        preOrder(root);

        System.out.println("\n中序遍历:");
        middleOrder(root);
    }
}
