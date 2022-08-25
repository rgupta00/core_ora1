package com.day3.session3;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(" thread started..."+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		System.out.println(" thread done..."+Thread.currentThread().getName());
	}
}
public class C_AnotherWay {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.setName("foo");
		myThread.start();
		
	}
}
