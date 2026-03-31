package com.rgzn.define;
public class MessageTest1 {
    public static void main(String[] args) {
        int rs = add(10);
        System.out.println(rs);
        System.out.println("-------------------------------------------");
        System.out.println(add(10));

    }
    public static int add(int n) {
       int sum = 0;
       for (int i = 1; i <= n; i++) {
           sum += i;
       }
       return sum;
    }
}
