package com.rgzn.type;

public class TypeConversion {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        long c = 30;
        long rs = a+b+c;
        System.out.println(rs);
        System.out.println("----------------");
        double rs2 = a+b+1.0;
        System.out.println(rs2);
        byte b1 = 10;
        byte b2 = 80;
        //byte c1 = b1+b2;//报错byte


    }
}
