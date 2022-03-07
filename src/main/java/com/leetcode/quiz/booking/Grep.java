package com.leetcode.quiz.booking;
/*
write algorithm for java grep command for word matching in the context. given a file containing n words, given a word and number k,
find k word in the file occuring before occurence of w
 */


import java.util.ArrayList;
import java.util.HashMap;

public class Grep {

    public static ArrayList<String> grep(String[] strarr, String tar, int k){
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        for(int i=0; i<strarr.length; i++){
            if(!map.containsKey(strarr[i])){
                map.put(strarr[i], i);
            }
        }
        if(map.containsKey(tar)){
            for(int i=map.get(tar)-k; i<=map.get(tar) && i>=0;i++){
                res.add(strarr[i]);
            }
        }
        print(res);
        return res;
    }

    public static void print(ArrayList arr) {
        for(Object obj : arr) {
            System.out.printf("%s,", obj);
        }
        System.out.println("END");
    }

    public static void main(String[] args){
        String[] test = new String[] {"aaa","bbb", "ccc", "booking", "alpha", "beta", "gamma"};
        Grep.grep(test, "booking", 3);
        Grep.grep(test, "beta", 3);
    }
}
