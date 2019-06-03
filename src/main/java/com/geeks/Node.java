package com.geeks;

import lombok.Data;

// https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
@Data
class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
