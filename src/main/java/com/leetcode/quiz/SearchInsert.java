package com.leetcode.quiz;

/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

你可以假设数组中无重复元素
 */

public class SearchInsert {

    public int searchInsert(int[] arr, int target){
        for(int i =0; i<arr.length; i++){
            if(arr[i]>=target)
                return i;
        }
        return arr.length;
    }

    public static void main(String[] args){
        SearchInsert test = new SearchInsert();
        System.out.println(test.searchInsert(new int[]{1, 3,4,5}, 2));
    }
}
