package com.leetcode.quiz;

import java.util.ArrayList;

/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */

public class MySqrt {

    public int mySqrt(int x){
        if(x<=0){
            return -1;
        }
        for(int i=1;i<=x/2; i++){
            if(i*i==x)
                return i;
            else if(i*i > x)
                return i-1;
        }
        return 0;
    }


    public static void main(String[] args){
        MySqrt sq = new MySqrt();
        System.out.println(sq.mySqrt(10));
        ArrayList<Integer> test = new ArrayList<>();

    }
}
