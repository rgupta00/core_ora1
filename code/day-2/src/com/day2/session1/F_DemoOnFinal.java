package com.day2.session1;

 class Foo{
	void fooMethod() {
		System.out.println("it is foo method");
	}
	final void fooMethod2() {
		System.out.println("it is foo method 2");
	}
}

class FooExtension extends Foo{
	void fooMethod() {
		System.out.println("it is foo method overriden");
		fooMethod2();
	}
	
	
}

public class F_DemoOnFinal {

	public static void main(String[] args) {
		final int i=55;
		
	}
}
