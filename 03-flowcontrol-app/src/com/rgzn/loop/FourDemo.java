package com.rgzn.loop;

import org.w3c.dom.ls.LSOutput;

import javax.tools.SimpleJavaFileObject;

public class FourDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i+=2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("1到100之间的奇数和" + sum);
        System.out.println("-----------------------------------------------------------");

    }

}
