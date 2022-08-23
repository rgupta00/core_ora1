
package com.day1.session2;
class MyClass{
    private static MyClass myClass=new MyClass();
    
    private MyClass(){
         System.out.println("ctr of MyClass");
    }
    
    public void doWork(){
        System.out.println("do work method");
    }
    
    public static MyClass getInstance(){
        return myClass;
    }
}

public class C_PrivateCtr {
    
    public static void main(String[] args) {
        MyClass myClass=MyClass.getInstance();
        myClass.doWork();
        
    }
}
