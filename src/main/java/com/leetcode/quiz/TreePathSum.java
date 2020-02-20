package com.leetcode.quiz;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */

public class TreePathSum {

    public boolean pathSum(IntTreeNode t, int sum){
        if(t == null) return false;
        if(t.left==null && t.right==null && sum == t.val) return true;
        return pathSum(t.left, sum-t.val)||pathSum(t.right, sum - t.val);
    }

    public static void main(String[] args){
        TreePathSum test = new TreePathSum();
        IntTreeNode t1 = new IntTreeNode(5);
        IntTreeNode t2 = new IntTreeNode(4);
        IntTreeNode t3 = new IntTreeNode(8);
        IntTreeNode t4 = new IntTreeNode(11);
        IntTreeNode t5 = new IntTreeNode(13);
        IntTreeNode t6 = new IntTreeNode(4);
        IntTreeNode t7 = new IntTreeNode(7);
        IntTreeNode t8 = new IntTreeNode(2);
        IntTreeNode t9 = new IntTreeNode(1);
        t1.left = t2; t1.right = t3;
        t2.left = t4; t3.left = t5; t3.right = t6;
        t4.right = t7; t4.left = t8; t6.right = t9;

        System.out.println(test.pathSum(t1, 22));
        System.out.println(test.pathSum(t1, 23));
    }
}
