package com.leetcode.quiz;

public class ReverseInteger {

    public int reverse(int x){
        if (x <=Integer.MIN_VALUE) return 0;

        //if (x<0)
        //    return -reverse(-x);
        int rev = 0;
        while(x!=0){
            int mod = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && mod > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && mod < -8)) return 0;
            rev = rev *10 + mod;
        }
        return rev;
    }

    public static void main(String[] args){
        int test = 123;
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(123));
        System.out.println(ri.reverse(-123));
        System.out.println(ri.reverse(-120));
    }
}
