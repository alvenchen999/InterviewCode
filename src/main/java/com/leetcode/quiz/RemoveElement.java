package com.leetcode.quiz;

/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */


public class RemoveElement {

    public int removeElement(int[] arr, int val){
        int len = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[len] = arr[i];
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args){
        RemoveElement test = new RemoveElement();
        System.out.println(test.removeElement(new int[]{1, 2,5,2,4,7,6}, 2));
    }
}
