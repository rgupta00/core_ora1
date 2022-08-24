
package com.day1.session3;
//3 kind of relationship: USE A 
//HAS -A

//IS A
//what is diff bw abs class and interface :
abstract class Vehical{
     abstract void move(String s, String d);
}
class Car extends Vehical{
    void move(String s, String d){
        System.out.println("moving from "+ s+" to "+ d +" using a car");
    }
}

class Metro extends Vehical{
    void move(String s, String d){
        System.out.println("moving from "+ s+" to "+ d +" using a metro");
    }
}


class Bike extends Vehical{
    void move(String s, String d){
        System.out.println("moving from "+ s+" to "+ d +" using a bike");
    }
}

class Passanger{
    private String name;
    public Passanger(String name){
        this.name=name;
    }
    public void travel(String s, String d,Vehical vehical ){
        System.out.println("name of the passanger is "+ name);
        vehical.move(s, d);
    }
}
public class LooseCoupling {
    
    public static void main(String[] args) {
        //  ram using his bike to move form BTM to lalbagh
        Vehical vehical=new Metro();
        Passanger p=new Passanger("ram");
        p.travel("BTM", "LalBagh", vehical);
        
        //if u have to change one thing bad coder need to change 10..place
    }
}
