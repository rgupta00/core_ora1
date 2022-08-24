package com.day2.session1;

interface Jumpable{
	void jump();
}
 class Monkey implements Jumpable{
	@Override
	public void jump() {
		System.out.println("it is a monkey jump");
	}
	void stayOnTree() {
		System.out.println("i stay on tree ...");
	}
}

class Kid implements Jumpable{
	
	void goToSchool() {
		System.out.println("i enjoy maths too much ...");
	}

	@Override
	public void jump() {
		System.out.println("i jump better then monkey");
	}
}

public class E_WhenUCanNotUserAbstClass {
	
	public static void main(String[] args) {
		Kid kid=new Kid();
		kid.goToSchool();
		
	}

}
