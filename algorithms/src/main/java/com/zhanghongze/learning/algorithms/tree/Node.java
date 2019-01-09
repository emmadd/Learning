package com.zhanghongze.learning.algorithms.tree;

import lombok.Data;

@Data
public class Node {

    public int data;

    public Node left;

    public Node right;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }
}
