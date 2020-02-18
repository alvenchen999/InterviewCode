package com.leetcode.quiz;


public class MergeLinkedList {

    public IntNode mergeList(IntNode l1, IntNode l2) {
        IntNode head = null;
        IntNode res = null;

        if (l1 == null || l2 == null)
            return null;
        if (l1.value < l2.value) {
            head = l1;
            l1 = head.next;
        } else {
            head = l2;
            l2 = head.next;
        }
        res = head;
        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                head.next = l1;
                head = l1;
                l1 = head.next;
            } else {
                head.next = l2;
                head = l2;
                l2 = head.next;
            }
        }
        if (l1 == null) {
            head.next = l2;
        }
        if (l2 == null) {
            head.next = l1;
        }
        return res;
    }

    public static void main(String[] args) {
        MergeLinkedList test = new MergeLinkedList();
        IntNode n1 = new IntNode(1);
        IntNode n12 = new IntNode(2);
        IntNode n13 = new IntNode(5);
        IntNode n2 = new IntNode(1);
        IntNode n21 = new IntNode(3);
        IntNode n23 = new IntNode(4);
        n1.next = n12;
        n12.next = n13;
        n2.next = n21;
        n21.next = n23;
        IntNode res = test.mergeList(n1, n2);
        IntNode.printNodeList(res);
    }

}
