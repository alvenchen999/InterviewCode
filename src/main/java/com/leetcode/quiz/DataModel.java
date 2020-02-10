package com.leetcode.quiz;

public class DataModel {
}

class IntNode {
    int value;
    IntNode next;

    IntNode(int num) {
        value = num;
    }

    static void printNodeList(IntNode a){
        while(a != null){
            System.out.printf("%d->", a.value);
            a = a.next;
        }
        System.out.print("NULL \n");
    }
}
