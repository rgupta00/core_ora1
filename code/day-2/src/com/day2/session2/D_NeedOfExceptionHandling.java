package com.day2.session2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D_NeedOfExceptionHandling {
	
	public static void main(String[] args) {
		
		//example of unchecked ex:
		
		//try catch throw throws finally
		//write a progam to divide a number 
		Scanner scanner=null;
		try {

			int a, b,c;
			System.out.println("PE two numbers");
			//risky code
			 scanner=new Scanner(System.in);
			a=scanner.nextInt();
			b=scanner.nextInt();
			
			 c=a/b;
			 
			 System.out.println(c);
			 
		}catch(ArithmeticException ex) {
			System.out.println("dont do divide by zero");
			
		}
		catch(InputMismatchException ex) {
			System.out.println("only integers are allowed");
		}finally {
			scanner.close();
		}
		
		
		 System.out.println("-------done----");
	}

}
