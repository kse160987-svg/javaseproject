package com.rgzn.define;

public class MessageDemo1 {
    public static void main(String[] args) {

        int rs = sum(10,20);
        System.out.println("和是"+rs);
        int rs2 = sum(10,30);
        System.out.println("和是"+rs2);
        printHelloWorld(5);
    }
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void printHelloWorld(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println("Hello World");

        }
    }


}

