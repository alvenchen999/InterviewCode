package com.leetcode.quiz;

/*
* 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
* */

public class StrStr {

    public int strStr(String haystack, String needle){
        if(needle.length() > haystack.length())
            return -1;
        if(needle.isEmpty())
            return 0;
        for(int i = 0; i<haystack.length()-needle.length()+1; i++){
            if(haystack.substring(i, i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        StrStr test = new StrStr();
        System.out.println(test.strStr("mississippi" ,"pi"));
    }
}
