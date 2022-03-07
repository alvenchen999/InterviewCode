package com.realtest.interview;

import java.util.LinkedList;

public class CalculatorTS {

    public int calculate(String s){
        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        int i = 0, sign = 1, res =0;
        while(i<s.length()){
            switch (s.charAt(i)){
                case ' ':
                    i++;
                    break;
                case '+':
                    sign = list.getLast();
                    i++;
                    break;
                case '-':
                    sign = -list.getLast();
                    i++;
                    break;
                default:
                    long num = 0;
                    while(i < s.length() && Character.isDigit(s.charAt(i))){
                        num = num*10 + s.charAt(i)-'0';
                        i++;
                    }
                    res += sign*num;
            }

        }
        System.out.println(res);
        return res;
    }

    /*
    public static void main(String[] args){
        CalculatorTS calc1 = new CalculatorTS();
        calc1.calculate("1+2-4+1-4  +1");
    }
     */
}
