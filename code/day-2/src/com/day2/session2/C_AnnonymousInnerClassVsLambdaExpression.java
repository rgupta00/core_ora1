package com.day2.session2;
@FunctionalInterface
interface Cookable{
	void cook();
}

//functional interface ===> labda expression => funcational programming : declaritive data processing*
//FI is a interface that have only one abstract method

public class C_AnnonymousInnerClassVsLambdaExpression {
	
	public static void main(String[] args) {
		//compiler of Java 7==> comp
		//kid of 2020==> kid of 2030==> 

		Cookable cookable=
				() ->System.out.println("street food sound tastly dont know about health issue");
			
		cookable.cook();
		
		Cookable cookable2=() ->System.out.println("hotel food sound ok..");
			
		
		cookable2.cook();
		
		Runnable runnable=()-> System.out.println("job of the thread");
			
		Thread thread=new Thread(runnable);
		thread.start();
		
		//thread.start();
		
		
		
		
		
		
//		Runnable runnable=new Runnable() {	
//			@Override
//			public void run() {
//				System.out.println("job of the thread");
//			}
//		};
//		
//		Thread thread=new Thread(runnable);
//		thread.start();
//		thread.start();
//		
//		
//		
//		Cookable cookable=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("street food sound tastly dont know about health issue");
//			}
//		};
//		cookable.cook();
//		
//		Cookable cookable2=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("hotel food sound ok..");
//			}
//		};
//		cookable2.cook();
		
	}

}
