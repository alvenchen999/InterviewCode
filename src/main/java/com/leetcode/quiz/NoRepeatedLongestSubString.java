package com.leetcode.quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Longest Substring Without Repeating Characters
/*
 * Given a string, find the length of the longest substring without repeating characters.

Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class NoRepeatedLongestSubString {

    public int lengthOfLongestSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int len = str.length();
        int res = 0, i = 0, j = 0;
        while (i < len && j < len) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j++));
                res = Math.max(res, j - i);
            } else
                set.remove(str.charAt(i++));
        }
        return res;
    }

    public int lengthOfLongestSubStringNew(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = str.length(), res = 0;
        for (int i = 0, j = 0; j < len; j++) {
            if (map.containsKey(str.charAt(j))) {
                i = Math.max(i, map.get(str.charAt(j)));
            }
            res = Math.max(res, j - i + 1);
            map.put(str.charAt(j), j + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        NoRepeatedLongestSubString test = new NoRepeatedLongestSubString();
        int res1 = test.lengthOfLongestSubstring("abcabcabcdd");
        System.out.println(res1);
        int res2 = test.lengthOfLongestSubStringNew("aabbccddefavd");
        System.out.println(res2);
    }
}
