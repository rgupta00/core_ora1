package com.day3.session3;

class Printer {

	synchronized  void print(String letter) {
		
		
		System.out.print("[");
		
		//assume printer is a slow device
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		System.out.println(letter + "]");
		
		
	}

}

class Client implements Runnable {
	private Printer printer;
	private String letter;
	private Thread thread;

	public Client(Printer printer, String letter) {
		this.printer = printer;
		this.letter = letter;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		printer.print(letter);
	}

}

public class E_NeedOfSyn {

	public static void main(String[] args) {
		Printer printer=new Printer();
		Client client1=new Client(printer, "I love java");
		Client client2=new Client(printer, "Phd paper printing");
		Client client3=new Client(printer, "I hate java");
		
		
		
	}

}
