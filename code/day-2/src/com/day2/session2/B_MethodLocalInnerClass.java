package com.day2.session2;

class C{
	void foo() {
		class D{
			void foof() {
				System.out.println("foof method of class D");
			}
		}
		
		D d=new D();
		d.foof();
	}
	
	void bar() {
		
	}
}

public class B_MethodLocalInnerClass {

	public static void main(String[] args) {
		
	}
}
