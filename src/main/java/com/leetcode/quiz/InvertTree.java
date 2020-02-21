package com.leetcode.quiz;

public class InvertTree {
    public IntTreeNode invertTree(IntTreeNode root){
        if(root == null) return root;
        IntTreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
