package com.rgzn.define;

public class MessageTest3 {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
        printArray(arr);

    }
    public static void printArray(int[] arr ) {
        if (arr == null) {
            System.out.println(arr );
            return;
        }
        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i]+",");
            }

        }
        System.out.print("]");

    }

}
