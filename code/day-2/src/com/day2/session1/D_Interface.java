package com.day2.session1;
//java dont support mutiple inheritance of class, by interface
interface A{
	int i=1;// public static and final
	void foo();//public and abstract 
}
interface B{
	int i=10;// public static and final
	void foo();//public and abstract 
}
class C implements A, B{
	public void foo() {
		System.out.println(B.i);
	//	B.i++; 	//can not change it
	}
}
public class D_Interface {
	
	public static void main(String[] args) {
		
	}

}
