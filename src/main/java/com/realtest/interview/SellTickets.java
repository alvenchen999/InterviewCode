package com.realtest.interview;

public class SellTickets implements Runnable{

    private static int totalTickets;

    public static void setTotalTickets(int tickets){ totalTickets = tickets;}


    @Override
    public void run(){
        while(true){
            synchronized(this){
                if(totalTickets>0){
                    System.out.printf("%s is selling No. %d ticket \n", Thread.currentThread().getName(), totalTickets);
                    totalTickets--;

                }else{
                    System.out.println("No ticket to sell!");
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        SellTickets seller = new SellTickets();
        seller.setTotalTickets(500);
        Thread s1 = new Thread(seller);
        s1.setName("window1");
        s1.start();
        Thread s2 = new Thread(seller);
        s2.setName("window2");
        s2.start();
    }
}
