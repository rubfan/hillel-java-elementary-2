package com.company;
public class Main {

    public static void main(String[] args) {

        int ticketNum;
        for (ticketNum = 100000; ticketNum <= 999999; ticketNum++) {
            if (LuckyCheck(ticketNum)) {
                System.out.println(ticketNum);
            }
        }
    }
    private static boolean LuckyCheck(int x){
        int a,b;
        a = (x/100000)%10+(x/10000)%10+(x/1000)%10;
        b= (x/100)%10+(x/10)%10+x%10;
        return a==b;
    }
}
