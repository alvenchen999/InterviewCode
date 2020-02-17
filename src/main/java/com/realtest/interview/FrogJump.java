package com.realtest.interview;

/*
* 台阶跳，每次跳1级或者2级，有N个台阶，共有多少跳法，斐波那契数列
* */

public class FrogJump {

    public int canJump(int n){
        if (n<=0){
            return -1;
        }
        else if (n==1){
            return 1;
        }
        else if (n==2){
            return 2;
        }
        else {
            return canJump(n-1) + canJump( n-2);
        }

    }

    public static void main(String[] args){
        FrogJump frogJump = new FrogJump();

        int res = frogJump.canJump(30);
        System.out.println(res);
    }
}
