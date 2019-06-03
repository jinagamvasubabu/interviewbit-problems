package com.geeks;

//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1

import lombok.Data;

@Data
class LinkedNode {
    int data;
    LinkedNode next;

    public LinkedNode(int data, LinkedNode next) {
        this.data = data;
        this.next = next;
    }
}

public class Sort012LinkedList {
    public static void main(String[] args) {
        LinkedNode n6 = new LinkedNode(0, null);
        LinkedNode n5 = new LinkedNode(2, n6);
        LinkedNode n4 = new LinkedNode(1, n5);
        LinkedNode n3 = new LinkedNode(2, n4);
        LinkedNode n2 = new LinkedNode(2, n3);
        LinkedNode n1 = new LinkedNode(1, n2);
        sort(n1);
        while (n1 != null) {
            System.out.print(n1.data);
            n1 = n1.next;
        }
    }

    private static void sort(LinkedNode node) {
        LinkedNode tempNode = node;
        int count[] = new int[]{0, 0, 0};
        while (node != null) {
            count[node.data]++;
            node = node.next;
        }

        while (tempNode != null) {
            if (count[0] > 0) {
                tempNode.data = 0;
                tempNode = tempNode.next;
                count[0]--;
            } else if (count[1] > 0) {
                tempNode.data = 1;
                tempNode = tempNode.next;
                count[1]--;
            } else if (count[2] > 0) {
                tempNode.data = 2;
                tempNode = tempNode.next;
                count[2]--;
            }
        }

    }


}
