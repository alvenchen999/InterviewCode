package com.realtest.interview;

import java.util.LinkedList;


public class LinkListCross {

    public Node isNodeInComm(LinkedList<Node> l1, LinkedList<Node> l2){
        int len1 = l1.size();
        int len2 = l2.size();
        int len_diff = 0;
        if(len1>len2){
            len_diff = len1-len2;
            for(int i=0; i<len_diff; i++){
                if(l1.get(i).equals(l2.getFirst())){
                    return l1.get(i);
                }
            }
            for(int i=0; i<len2; i++){
                if(l1.get(i+len_diff).equals(l2.get(i))){
                    return l2.get(i);
                }
            }
        }
        else{
            len_diff = len2 - len1;
            for(int i=0; i<len_diff; i++){
                if(l2.get(i).equals(l1.getFirst())){
                    return l2.get(i);
                }
            }
            for(int i=0; i<len1; i++){
                if(l2.get(i+len_diff).equals(l1.get(i))){
                    return l1.get(i);
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        LinkListCross llc = new LinkListCross();
        Node n1= new Node(1);
        Node n12= new Node(2);
        Node n13= new Node(3);
        Node n14= new Node(4);
        Node n2= new Node(5);
        Node n22= n13;
        Node n23= new Node(6);
        Node n24= new Node(7);
        Node n25= new Node(8);

        LinkedList<Node> l1 = new LinkedList<>();
        LinkedList<Node> l2 = new LinkedList<>();
        l1.addLast(n1);
        l1.addLast(n12);
        l1.addLast(n13);
        l1.addLast(n14);
        l2.addLast(n2);
        l2.addLast(n22);
        l2.addLast(n23);
        l2.addLast(n24);
        l2.addLast(n25);

        Node res = llc.isNodeInComm(l1, l2);
        System.out.println(res.val);
    }
}


class Node{

    int val;
    Node next;

    public Node(int v){
        this.val = v;
    }
}

