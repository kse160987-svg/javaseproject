package com.rgzn.type;

public class TypeConversation3 {
    public static void main(String[] args) {
        int a = 20;
        byte b = (byte) a;//报错，选择强制转换，使用快捷键alt+enter,自动强制转换
        System.out.println(a);
        System.out.println(b);
        System.out.println("-------------------------------");
        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);
        double d = 99.5;
        int n = (int) d;
        System.out.println(n);


    }
}
