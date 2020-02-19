package com.leetcode.quiz;

public class RemoveDuplicate {

    public int removeDuplicate(int[] arr){

        int len = 0;
        for(int i=0;i<arr.length; i++){
            if(arr[i] != arr[len]){
                arr[len] = arr[i];
                len++;
            }
        }

        return len;
    }


    public static void main(String[] args){
        RemoveDuplicate test= new RemoveDuplicate();
        int[] arr1 =  new int[] {1,2,2,3,4,5,5};
        System.out.println(test.removeDuplicate(arr1));
    }
}
