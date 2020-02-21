package com.leetcode.quiz;

public class ClimbStairs {

    public int climbStairs(int n){
        if(n<=0) return -1;
        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else
            return climbStairs(n-1) + climbStairs(n-2);
    }

    public int climbStairs1(int n){
        if(n<=0) return -1;
        int cur = 1, pre = 1, prepre = 1;
        for(int i=2; i<=n; i++){
            cur = pre + prepre;
            prepre = pre;
            pre = cur;
        }
        return cur;
    }

    public static void main(String[] args){
        ClimbStairs test = new ClimbStairs();
        System.out.println(test.climbStairs(4));
        System.out.println(test.climbStairs1(45));
    }
}
