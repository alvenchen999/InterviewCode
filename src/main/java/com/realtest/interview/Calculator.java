package com.realtest.interview;
import java.util.Deque;
import java.util.LinkedList;


/*
给你一个字符串表达式 s ，请你实现一个基本计算器来计算并返回它的值。
输入：s = " 2-1 + 2 "
输出：3
1 <= s.length <= 3 * 105
s 由数字、'+'、'-'、'('、')'、和 ' ' 组成
s 表示一个有效的表达式
 */

public class Calculator {

    public int calculate(String s) {
        Deque<Integer> deque = new LinkedList<>();
        deque.push(1);
        int sign = 1;
        int res = 0, i = 0 ;
        int n = s.length();
        while(i<n){
            if( s.charAt(i) == ' '){
                i++;
            }else if( s.charAt(i) == '+'){
                sign = deque.peek();
                i++;
            }else if( s.charAt(i) == '-'){
                sign = -deque.peek();
                i++;
            }else if( s.charAt(i) == '('){
                deque.push(sign);
                i++;
            }else if( s.charAt(i) == ')'){
                deque.pop();
                i++;
            }else{
                long num = 0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    num = num*10 + s.charAt(i)-'0';
                    i++;
                }
                res += sign * num;
            }
        }
        return res;
    }

    public static void main(String[] args){
        String s = "1+2+3-4-5";
        Calculator cal = new Calculator();
        int res = cal.calculate(s);
        System.out.println(res);
    }
}
