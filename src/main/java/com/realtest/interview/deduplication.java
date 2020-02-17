package com.realtest.interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class deduplication {

    public ArrayList<String> deduplicate(ArrayList<String> list){
        Set<String> set = new LinkedHashSet<>(list);
        ArrayList<String> res = new ArrayList<>(set);
        return res;
    }


    public static void main(String[] args){
        deduplication dep = new deduplication();
        ArrayList<String> test = new ArrayList<>();
        test.add("t1");
        test.add("t2");
        test.add("t3");
        test.add("t2");
        test.add("t2");
        test.add("t1");
        test.add("t5");
        ArrayList<String> res = dep.deduplicate(test);
        for(String tmp : res){
            System.out.println(tmp);
        }
    }
}
