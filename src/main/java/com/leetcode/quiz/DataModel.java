package com.leetcode.quiz;

public class DataModel {
}

class IntNode {
    int value;
    IntNode next;

    IntNode(int num) {
        value = num;
    }

    static void printNodeList(IntNode a){
        while(a != null){
            System.out.printf("%d->", a.value);
            a = a.next;
        }
        System.out.print("NULL \n");
    }
}

class IntTreeNode{
    int val;
    IntTreeNode left;
    IntTreeNode right;

    IntTreeNode(int val, IntTreeNode left, IntTreeNode right){
        this.val= val;
        this.left = left;
        this.right = right;
    }

    IntTreeNode(int val){
        this.val = val;
    }

    static void printDLRTree(IntTreeNode root){
        if(root != null){
            System.out.println(root.val);
            printDLRTree(root.left);
            printDLRTree(root.right);
        }
    }

    static void printLDRTree(IntTreeNode root){
        if(root != null){
            printDLRTree(root.left);
            System.out.println(root.val);
            printDLRTree(root.right);
        }
    }

    static void printLRDTree(IntTreeNode root){
        if(root != null){
            printDLRTree(root.left);
            printDLRTree(root.right);
            System.out.println(root.val);
        }
    }
}