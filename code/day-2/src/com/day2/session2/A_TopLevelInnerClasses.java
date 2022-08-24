package com.day2.session2;

class A{
	class B{
		void foo() {
			System.out.println("foo method of class B");
		}
	}
}

public class A_TopLevelInnerClasses {

	public static void main(String[] args) {
		A.B b=new A().new B();
		b.foo();
	}
}
