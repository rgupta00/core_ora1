package com.day2.session2;

import java.io.FileNotFoundException;
import java.io.IOException;

class A1{

	public void foo()throws IOException{
		System.out.println("hello");
	}
}

class B extends A1{

	public void foo() throws FileNotFoundException{
		System.out.println("hello overriding");
	}
}
public class H_ExHandingAndOverriding {

	public static void main(String[] args) {
		A1 a=new B();
		try {
			a.foo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
