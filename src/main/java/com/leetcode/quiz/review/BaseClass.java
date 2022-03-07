package com.leetcode.quiz.review;



public class BaseClass {

    public void printInt(int t){System.out.printf("Int: %d\n", t);}

    public void printIntArr(int[] arr){
        System.out.printf("IntArr: [ ");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("]\n");
    }

    public void printDouble(double n, int bit){
        String format = "double: %." + bit + "f\n";
        System.out.printf(format, n);
    }

    public void printLong(long n){
        System.out.printf("Long: %d\n", n);
    }

    public static void main(String[] args){
        BaseClass base = new BaseClass();
        base.printDouble(4.5555555, 3);
    }
}
