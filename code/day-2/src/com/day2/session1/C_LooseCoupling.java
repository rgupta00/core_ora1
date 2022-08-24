package com.day2.session1;
//a passanger is moving from LN to Noida using Car
//abstract class Vehical{
//	abstract public void move(String s, String d);
//}

import java.util.Scanner;

interface Vehical{
	abstract public void move(String s, String d);
}

class Bike implements Vehical{
	public void move(String s, String d) {
		System.out.println("moving form "+ s + " to "+ d +" using bike");
	}
}

class Metro implements Vehical{
	public void move(String s, String d) {
		System.out.println("moving form "+ s + " to "+ d +" using metro");
	}
}

class Car implements Vehical{
	public void move(String s, String d) {
		System.out.println("moving form "+ s + " to "+ d +" using car");
	}
}
class Passanger{
	private String name;
	
	public Passanger(String name) {
		this.name = name;
	}
	public void travel(String s, String d, Vehical vehical) {
		vehical.move(s, d);
	}
}
public class C_LooseCoupling {
	
	public static void main(String[] args) {
		Passanger passanger=new Passanger("ravi");
		//Car car=new Car();
		Scanner scanner = new Scanner(System.in);

		Vehical vehical= null;
		System.out.println("1. for Bike 2. for Car 3. for Metro");
		int choice = scanner.nextInt();

		if (choice == 1) {
			vehical = new Bike();
		} else if (choice == 2) {
			vehical = new Car();
		} else if (choice == 3) {
			vehical = new Metro();
		}
		
		if(vehical!=null) {
			passanger.travel("LN", "ITO", vehical);
		}else {
			System.out.println("invalid input");
		}
		
		
		
	}

}
