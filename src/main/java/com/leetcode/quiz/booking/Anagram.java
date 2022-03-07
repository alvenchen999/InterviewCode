package com.leetcode.quiz.booking;
import java.util.HashMap;
import java.util.HashSet;
/*
 * a variation of determining if a string is an anagram of another
 * same letters but order is differnt means anagram
 */
public class Anagram {

    public boolean isAnagram(String a, String b){

        if(a.length() != b.length()) return false;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<a.length(); i++){
            if(!set.contains(a.charAt(i)) ){
                set.add(a.charAt(i));
            }else
                set.remove(a.charAt(i));
            if(!set.contains(b.charAt(i))){
                set.add(b.charAt(i));
            }else
                set.remove(b.charAt(i));
        }
        System.out.println(set.isEmpty());
        return set.isEmpty();
    }

    public static void main(String[] args){
        Anagram test = new Anagram();
        test.isAnagram("ate", "eat");
        test.isAnagram("apple", "aplep");
        test.isAnagram("abbbcc", "adddcc");
    }
}
