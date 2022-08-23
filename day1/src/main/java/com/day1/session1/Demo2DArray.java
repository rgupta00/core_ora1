package com.day1.session1;

public class Demo2DArray {

    public static void main(String[] args) {
//        int a[][]=new int [5][4];
        int a[][] = {{4,5,6},{5,7,8}};
        for (int temp[] : a) {
            for (int tempVal : temp) {
                System.out.print(tempVal + " ");
            }
            System.out.println(" ");
        }

//        int arr[]={5,6,7};
//        a[0]=arr;
    }
}
