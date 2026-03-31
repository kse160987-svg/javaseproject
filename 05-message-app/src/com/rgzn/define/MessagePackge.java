package com.rgzn.define;

public class MessagePackge {
    public static void main(String[] args) {
        judge(7);
        judge(8);
    }
    public static  void judge(int number) {
        if (number % 2 == 0) {
            System.out.println("偶数");

        }else
            System.out.println("奇数");
    }


}
