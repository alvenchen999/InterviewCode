package com.leetcode.quiz;

public class MinTreeDepth {

    public int minDepth(IntTreeNode root){
        int mindep = Integer.MAX_VALUE;
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        if(root.left != null)
            mindep = Math.min(mindep, minDepth(root.left));
        if(root.right != null)
            mindep = Math.min(mindep, minDepth(root.right));
        return mindep +1;

    }
}
