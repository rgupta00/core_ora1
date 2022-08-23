
package com.day1.session1;

public class LoopingEx {
    
    public static void main(String[] args) {
        System.out.println("stars");
        for(int i=0;i<10;i++){
             for(int k=9; k>i; k--){
                  System.out.print(" ");
             }
                 
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
   
        
        
        
        
    }
}
