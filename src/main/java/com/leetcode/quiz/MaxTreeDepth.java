package com.leetcode.quiz;

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */

public class MaxTreeDepth {

    public int maxDepth(IntTreeNode root) {
       if(root == null) return 0;
       int left_heigh = maxDepth(root.left);
       int right_heigh = maxDepth(root.right);
       return Math.max(left_heigh, right_heigh) + 1;
    }
}
