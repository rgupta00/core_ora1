package com.day3.session3.java9features;

interface MyLogger{
	default void logInfo(String message) {
		//
		log();
	}
	//private method inside the java 9 act as a  helper method to default methods
	private void log() {
		System.out.println("it is a log method");
	}
}
public class A_privateMethodInsideInterface {
	
	public static void main(String[] args) {
		
	}

}
