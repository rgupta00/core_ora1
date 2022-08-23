package com.day1.session1;

public class DemoArray {

    public static void main(String[] args) {
//        int a[]=new int[5];
        int a[] = {6,7,8};
        int sum=0;
        
        //enhance for loop
        for(int val: a){
            sum+=val;
        }
        
//        for (int i = 0; i <= a.length; i++) {
//           sum+=a[i];
//        }
        
        System.out.println("sum is "+ sum);
        //how to iterate 
        //System.out.println(a[40]);
    }
}
