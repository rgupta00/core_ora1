package com.day2.session1;
//function overloading
class Cal{
	
	public int add(int a, int b) {
		System.out.println("public int add(int a, int b)");
		return a+b;
	}
	//variable arument method
	public int add(int ...a) {
		System.out.println("public int add(int ...a)");
		int sum=0;
		for(int val: a) {
			sum+=val;
		}
		return sum;
	}
	
	
//	public long add(long a, int b) {
//		System.out.println("public long add(long a, int b)");
//		return a+b;
//	}
//	public long add(int a, long b) {
//		System.out.println("public long add(int a, long b)");
//		return a+b;
//	}
	
//	public int add(int a, int b, int c) {
//		return a+b+c;
//	}
}
public class A_FunctionOverloading {

	public static void main(String[] args) {
		Cal cal=new Cal();
		int sum=cal.add(3, 2,5,6,7);//compiler know which method is going to be called ie way it called compile time polym...
		System.out.println(sum);
	}
}
