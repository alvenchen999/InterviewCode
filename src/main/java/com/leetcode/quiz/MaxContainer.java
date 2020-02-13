package com.leetcode.quiz;

/*
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
 */

public class MaxContainer {

    public int maxArea(int[] arr) {
        int max = 0;
        int start = 0, end = arr.length - 1;
        int loopCnt = 0;
        while (start < end) {
            System.out.printf("Loop: %d\n", loopCnt++);
            int height = Math.min(arr[start], arr[end]);
            max = Math.max(max, (end-start)*height);
            if (arr[start] >= arr[end]) {
                end--;
            }else{
                start++;
            }
        }

        return max;
    }

    public static void main(String[] args){
        MaxContainer test = new MaxContainer();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int res = test.maxArea(arr);
        System.out.println(res);
    }
}
