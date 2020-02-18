package com.leetcode.quiz;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String str){
        char[] charArr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(Character ch : charArr){
            switch (ch){
                case('('):
                    stack.push(')');
                    break;
                case('['):
                    stack.push(']');
                    break;
                case('{'):
                    stack.push('}');
                    break;
                default:
                    if(stack.isEmpty() || stack.pop() != ch)
                        return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        ValidParentheses test = new ValidParentheses();
        System.out.println(test.isValid("{{()}}[]"));
        System.out.println(test.isValid("{{()}}[]"));
    }
}
