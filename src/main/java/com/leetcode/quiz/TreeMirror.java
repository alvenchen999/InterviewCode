package com.leetcode.quiz;

public class TreeMirror {

    public boolean isMirror(IntTreeNode root){
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(IntTreeNode t1, IntTreeNode t2){
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        if(t1.val == t2.val){
            return isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);
        }
        return false;
    }


    public static void main(String[] args){
        TreeMirror test = new TreeMirror();
        IntTreeNode t1 = new IntTreeNode(1);
        IntTreeNode t2 = new IntTreeNode(2);
        IntTreeNode t3 = new IntTreeNode(2);
        IntTreeNode t4 = new IntTreeNode(4);
        IntTreeNode t5 = new IntTreeNode(4);
        IntTreeNode t6 = new IntTreeNode(1);

        t1.left = t2; t1.right = t3; t2.right = t4; t3.left = t5;

        System.out.println(test.isMirror(t1));
        t5.left = t6;
        System.out.println(test.isMirror(t1));
    }

}
