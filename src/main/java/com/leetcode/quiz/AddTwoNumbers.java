package com.leetcode.quiz;

import com.leetcode.quiz.IntNode;
//problem 2
/*
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
	 */

public class AddTwoNumbers {

    public IntNode addTwoNumbers(IntNode a, IntNode b){
        IntNode res = new IntNode(0);
        IntNode p = a, q = b, curr = res;
        int increase = 0;
        while (p != null || q != null){
            int t1 = (p != null)? p.value:0;
            int t2 = (q != null)? q.value:0;
            int sum = t1 + t2 + increase;
            increase = sum/10;
            curr.next = new IntNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (increase > 0){
            curr.next = new IntNode(increase);
        }
        return res.next;
    }


    public static void main(String[] args){
        AddTwoNumbers res = new AddTwoNumbers();
        IntNode l1 = new IntNode(2);
        IntNode l2 = new IntNode(4);
        IntNode l3 = new IntNode(3);
        IntNode ll1 = new IntNode(5);
        IntNode ll2 = new IntNode(6);
        IntNode ll3 = new IntNode(9);
        IntNode ll4 = new IntNode(1);

        l1.next = l2; l2.next = l3;
        ll1.next = ll2; ll2.next = ll3; ll3.next = ll4;
        IntNode final_res = res.addTwoNumbers(l1, ll1);
        IntNode.printNodeList(final_res);
    }
}
