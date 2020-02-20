package com.leetcode.quiz;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 */

public class RemoveDuplicateList {

    public IntNode deleteDuplicate(IntNode n){
        if(n == null)
            return null;
        if(n.next == null)
            return n;
        IntNode head = n;
        while(n!=null){
            if(n.value != n.next.value)
                n = n.next;
            else{
                n.next = n.next.next;
            }
        }
        return head;
    }


}
