package com.leetcode.quiz;

public class SameTree {

    public boolean isSameTree(IntTreeNode t1, IntTreeNode t2){
        if(t1==null && t2==null)
            return true;
        if(t1==null || t2==null)
            return false;
        if(t1.val != t2.val)
            return false;
        return (isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right));
    }

    public static void main(String[]  args){
        SameTree test = new SameTree();
        IntTreeNode t1 = new IntTreeNode(1);
        IntTreeNode t2 = new IntTreeNode(2);
        IntTreeNode t3 = new IntTreeNode(3);
        IntTreeNode t4 = new IntTreeNode(4);
        IntTreeNode t5 = new IntTreeNode(5);
        IntTreeNode t21 = new IntTreeNode(1);
        IntTreeNode t22 = new IntTreeNode(2);
        IntTreeNode t23 = new IntTreeNode(3);
        IntTreeNode t24 = new IntTreeNode(4);
        IntTreeNode t25 = new IntTreeNode(5);
        IntTreeNode t26 = new IntTreeNode(6);
        t1.left = t2; t1.right = t3;
        t2.left = t4; t3.left = t4; t3.right = t5;
        t21.left = t22; t21.right = t23;
        t22.left = t24; t23.left = t24; t23.right = t25;
        System.out.println(test.isSameTree(t1, t21));
        t25.left = t26;
        System.out.println(test.isSameTree(t1, t21));
    }
}
