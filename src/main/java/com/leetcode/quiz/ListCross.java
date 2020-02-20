package com.leetcode.quiz;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 */

public class ListCross {

    public IntNode getCrossedNode(IntNode n1, IntNode n2){
        if(n1 == null || n2 == null) return null;
        IntNode p = n1, q = n2;
        while(p != q){
            p = p == null? n2: p.next;
            q = q == null? n1: q.next;
            if(p==q)
                return p;
        }
        return null;
    }

    public static void main(String[] args){
        ListCross test = new ListCross();
        IntNode n11 = new IntNode(1);
        IntNode n12 = new IntNode(3);
        IntNode n13 = new IntNode(4);
        IntNode n14 = new IntNode(5);
        IntNode n21 = new IntNode(1);
        IntNode n22 = new IntNode(3);
        IntNode n23 = new IntNode(4);
        IntNode n24 = new IntNode(5);
        IntNode n25 = new IntNode(8);
        IntNode n26 = new IntNode(10);
        n11.next = n12; n12.next=n13; n13.next = n14;
        n21.next = n22; n22.next=n23; n23.next = n12;

        System.out.println(test.getCrossedNode(n11, n21).value);
        n23.next = n24;
        System.out.println(test.getCrossedNode(n11, n21));

    }
}
