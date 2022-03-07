package com.leetcode.quiz.review;

import java.util.HashMap;

/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
你可以按任意顺序返回答案。

 */
public class TwoNumberSum extends BaseClass {

    //Best solution!
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap();
        for(int i=0; i<nums.length; i++){
            int tmp = target - nums[i];
            if(hash.containsKey(tmp) && hash.get(tmp) != i){
                return new int[]{hash.get(tmp), i};
            }else{
                hash.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No solution");
    }


    public static void main(String[] args){
        TwoNumberSum test = new TwoNumberSum();
        int[] input = new int[]{2, 7,11,15};
        test.printIntArr(test.twoSum(input, 9));

    }
}
