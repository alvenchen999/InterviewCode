package com.leetcode.quiz;

import java.util.HashMap;

/*
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
Example:
Given array nums = [-1, 2, 1, -4], and target = 1.
The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<2)
            throw new IllegalArgumentException("Array length should be larger than 2");

        int closest = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){

        }

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1;j<nums.length-1; j++){

            }
        }

        return 0;
    }
}
