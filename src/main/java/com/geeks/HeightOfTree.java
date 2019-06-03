package com.geeks;

import lombok.Data;

import java.util.Objects;

//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
public class HeightOfTree {
    public static void main(String[] args) {
        Node n6 = new Node(6, null, null);
        Node n5 = new Node(5, null, null);
        Node n4 = new Node(4, n5, null);
        Node n3 = new Node(3, null, n6);
        Node n2 = new Node(2, n4, null);
        Node n1 = new Node(1, n2, n3);
        // Node.print(n1);
        System.out.println(height(n1));
    }

    public static int height(Node root) {
        if (root == null) return 0;
        else {
            int ldepth = height(root.getLeft());
            int rdepth = height(root.getRight());
            if (ldepth > rdepth) {
                return ldepth + 1;
            }

            return rdepth + 1;
        }
    }


}
