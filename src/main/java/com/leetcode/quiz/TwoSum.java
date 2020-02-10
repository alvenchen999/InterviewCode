package com.leetcode.quiz;

import java.util.HashMap;
import java.util.ArrayList;

/*problem 1
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 *
 */

public class TwoSum {

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d,", arr[i]);
        }
        System.out.print("END\n");
    }

    //worst solution
    public int[] addTwoSum(int[] arr, int target) {
        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; i < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return res;
    }

    //potential bug, if value is duplicated, etc
    public int[] addTwoSum2(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            map.put(arr[i], i);
        }
        for(int i=0; i<arr.length; i++){
            int rest = target - arr[i];
            if(map.containsKey(rest) && map.get(rest) != i){
                return new int[]{i, map.get(rest)};
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    public int[] addTwoSum3(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            int rest = target - arr[i];
            if(map.containsKey(rest) && map.get(rest) != i){
                return new int[]{i, map.get(rest)};
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }


    public static void main(String[] args){
        int[] testarr = new int[]{2, 3, 12, 7, 5};
        TwoSum ts = new TwoSum();
        int[] res1 = ts.addTwoSum(testarr, 5);
        TwoSum.printArray(res1);
        int[] res2 = ts.addTwoSum2(testarr, 15);
        TwoSum.printArray(res2);
        int[] res3 = ts.addTwoSum3(testarr, 19);
        TwoSum.printArray(res3);
    }
}
