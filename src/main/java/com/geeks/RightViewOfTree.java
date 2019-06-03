package com.geeks;

import java.util.LinkedList;
import java.util.Queue;

//https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1
public class RightViewOfTree {
    public static void main(String[] args) {
        Node n7 = new Node(7, null, null);
        Node n6 = new Node(6, null, null);
        Node n5 = new Node(5, null, null);
        Node n4 = new Node(4, null, null);
        Node n3 = new Node(3, n6, n7);
        Node n2 = new Node(2, n4, n5);
        Node n1 = new Node(1, n2, n3);
        // Node.print(n1);
        rightView(n1);
    }

    static void rightView(Node node) {
        if (node != null) {
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()) {
                int n = queue.size();

                for (int i = 1; i <= n; i++) {
                    Node tempNode = queue.poll();
                    if (i == n && tempNode != null)
                        System.out.print(tempNode.getData() + " ");
                    if (tempNode != null && tempNode.getLeft() != null)
                        queue.add(tempNode.getLeft());
                    if (tempNode != null && tempNode.getRight() != null)
                        queue.add(tempNode.getRight());
                }
            }
        }
    }
}
