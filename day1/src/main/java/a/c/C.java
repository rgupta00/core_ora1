package a.c;
import a.b.*;
public class C extends A{
    
    public static void main(String[] args) {
       // B b=new B();
        //A a=new A();
        
        C c=new C();
        System.out.println("value of m: "+ c.m);
        c.print3();
        
        
      //  a.print4();
       // System.out.println("value of m: "+ a.m);
       // a.print3();
      //  System.out.println("value of k"+ a.k);
    }
}
