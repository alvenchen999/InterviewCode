package com.leetcode.quiz;

import java.util.HashSet;

public class CircleList {

    public boolean isCircle(IntNode head){
        if(head == null || head.next == null) return false;
        IntNode slow = head;
        IntNode fast = head.next;
        while(fast != null && fast.next != null){
            if(slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    //Performance is worse
    public boolean isCircle1(IntNode head){
        HashSet<IntNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
