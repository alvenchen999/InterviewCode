package com.realtest.interview;
import com.leetcode.quiz.review.BaseClass;
import org.omg.PortableInterceptor.INACTIVE;

public class SqrtTest extends BaseClass{

    public int getSqrt(int n){
        if(n<0) return 0;
        long low = 0;
        long high = n/2 +1;

        while(low < high){
            long mid = low + (high-low+1)/2;
            long sqr = mid*mid;
            if(sqr > n){
                high = mid - 1;
            }else{
                low = mid;
            }
        }
        printLong(low);
        return (int)low;
    }

    public static void main(String[] args){
        SqrtTest sqrt = new SqrtTest();
        sqrt.getSqrt(5);
    }
}
