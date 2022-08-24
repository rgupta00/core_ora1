
package com.day1.session3;
class A{
    private int i;

    public A(int i) {
        this.i = i;
    }
  
    public void printA(){
        System.out.println("value of i: "+ i);
    }  
}
class B extends A{
    private int j;

    public B(int i, int j) {
         super(j);
        this.j = j;
 
    }
  
    public void printA(){
        super.printA();
        System.out.println("value of j: "+ j);
    }  
}

class C extends B{
    private int k;

    public C(int i, int j, int k) {
         super(i,j);
        this.k = k;
 
    }
  
    public void printA(){
        super.printA();
        System.out.println("value of k: "+ k);
    }  
}

//class C extends  A, B{
//    
//}
public class ParamterPassingToBaseClass {
    
    public static void main(String[] args) {
        A a=new C(4,6,100);
        a.printA();
    }
        
}
