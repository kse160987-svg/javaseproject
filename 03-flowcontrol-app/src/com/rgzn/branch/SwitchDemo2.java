package com.rgzn.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String week = "周三";
        switch (week) {
            case "周一":
                System.out.println("a");
                break;
            case "周二":
                System.out.println("b");
                break;
            case "周三":
                System.out.println("c");
                break;
            case "周四":
                System.out.println("d");
                break;
            case "周五":
                System.out.println("e");
                break;
            case "周六":
                System.out.println("f");
                break;
            case "周日":
                System.out.println("g");
                break;
            default:
                System.out.println("h");
        }
    }
}
