package com.leetcode.quiz;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 */

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int sum = 0, ans = nums[0];
        for(int tmp : nums){
            if(sum > 0 )
                sum += tmp;
            else
                sum = tmp;
            ans = Math.max(sum, ans);
        }
        return ans;
    }

    public int maxProfit(int[] prices){
        if(prices.length == 0) return 0;
        int left = prices[0], maxprofit = 0;
        for(int i=1; i<prices.length; i++){
            left = Math.min(left, prices[i]);
            maxprofit = Math.max(maxprofit, prices[i]-left);
        }
        return maxprofit;
    }

    public static void main(String[] args){
        MaxSubArray test = new MaxSubArray();
        System.out.println(test.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
