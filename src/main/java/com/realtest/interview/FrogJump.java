package com.realtest.interview;

/*
* 台阶跳，每次跳1级或者2级，有N个台阶，共有多少跳法，斐波那契数列
* */

public class FrogJump {

    //bad performance
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

    public int canJump2(int n){
        if(n<0){return -1;}
        int sum = 0, tmp1 = 0, tmp2 = 0;
        for(int i=1; i<=n; i++){
            if(i==1){tmp2 = 1;}
            else if(i==2){tmp1 = 2;}
            else{
                sum = tmp1 + tmp2;
                tmp2 = tmp1;
                tmp1 = sum;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        FrogJump frogJump = new FrogJump();

        int res = frogJump.canJump(40);
        int res2 = frogJump.canJump2(40);
        System.out.println(res);
        System.out.println(res2);
    }
}
