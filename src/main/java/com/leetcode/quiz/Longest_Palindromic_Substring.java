package com.leetcode.quiz;

import java.util.LinkedList;
import java.util.HashMap;

public class Longest_Palindromic_Substring {


    public LinkedList<String> longestPalindromicSubString(String str) {
        LinkedList<String> res = new LinkedList<>();
        int start = 0, cnt = 0;
        for(int i=0; i<str.length()/2; i++){
            for(int j=str.length()-1; j>i; j--){
                System.out.println(cnt++);
                if(isPalindromicString1(str.substring(i,j))){
                    if(res.isEmpty())
                        res.addLast(str.substring(i,j));
                    else{
                        if(res.getLast().length()<str.substring(i,j).length()){
                            res.removeLast();
                            res.addLast(str.substring(i,j));
                        }
                        if(res.getLast().length()==str.substring(i,j).length())
                            res.addLast(str.substring(i, j));
                    }
                }
            }
        }
        return res;
    }

    public String longestPalindromicSubString1(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int len1 = longestPalindaricStr(str, i, i);
            int len2 = longestPalindaricStr(str, i, i + 1);
            int len = Math.max(len1, len2);
            if (end - start < len) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return str.substring(start, end + 1);
    }

    public boolean isPalindromicString(String str) {
        char[] charArr = str.toCharArray();
        boolean res = false;
        for (int i = 0, j = charArr.length - 1; i < charArr.length / 2; i++) {
            if (charArr[i] == charArr[j]) {
                j--;
            } else
                return false;
        }
        return true;
    }

    public boolean isPalindromicString1(String str) {
        StringBuilder sb = new StringBuilder();
        if(sb.append(str).reverse().toString().compareTo(str) ==0)
            return true;
        else
            return false;
    }

    public int longestPalindaricStr(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Longest_Palindromic_Substring test = new Longest_Palindromic_Substring();
        System.out.println(test.isPalindromicString("abbaq"));
        //LinkedList<String> result = test.longestPalindromicSubString1("babad");
        String res = test.longestPalindromicSubString1("babad");
        System.out.println(res);
        LinkedList<String> res1 = test.longestPalindromicSubString("babad");
        for(String tmp: res1){
            System.out.println(tmp);
        }
    }

}
