package com.day3.session3;

public class D_YetAnotherWay {
	
	public static void main(String[] args) {
		
		Thread thread=new Thread(()-> System.out.println("it is the job of the thread"));
		thread.start();
	}

}
