package com.day3.session3;

//Green thread: is background threads
class MyJob implements Runnable{

	@Override
	public void run() {
		System.out.println(" thread started..."+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		System.out.println(" thread done..."+Thread.currentThread().getName());
	}
	
}
public class B_HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start:"+Thread.currentThread().getName());
		
		MyJob job=new MyJob();
		Thread thread1=new Thread(job, "A");
		//thread1.setPriority(Thread.MAX_PRIORITY);
		
		
		Thread thread2=new Thread(job, "B");
		
		
		thread1.start();
		thread2.start();
		
		//join method
		thread1.join(2000);
		thread2.join(2000);
		
		System.out.println("end:"+Thread.currentThread().getName());
		
		
	}
}
