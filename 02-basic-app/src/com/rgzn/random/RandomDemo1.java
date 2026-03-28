package com.rgzn.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();//导包
        for (int i = 1; i <= 20; i++) {
            int data = r.nextInt(10) +1;
            System.out.println(data);
        }//在random随机数中使用for循环：选中ctrl+alt+T

    }
}
