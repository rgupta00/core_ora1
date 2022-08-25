package com.day3.session3;

public class F_DeadLock {

	public static void main(String[] args) {
		final Object r1="bat";
		final Object r2="ball";
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("t1 get lock on bat");
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {}
					synchronized (r2) {
						System.out.println("t1 get lock on ball");
					}
				}
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("t2 get lock on bat");
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {}
					synchronized (r2) {
						System.out.println("t2 get lock on ball");
					}
				}
				
			}
		});
		
		
		t1.start();
		t2.start();
		
		
	}
}
