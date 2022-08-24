package com.day2.session1;

import java.util.Scanner;

class Shape {
	public void printArea() {
		System.out.println(" i dont know the area");
	}
}

class Square extends Shape {
	@Override
	public void printArea() {
		System.out.println("l * b");
	}
}

class Circle extends Shape {
	@Override
	public void printArea() {
		System.out.println(" PI r * r");
	}
}

class Triangle extends Shape {
	@Override
	public void printArea() {
		System.out.println(" 0.5 * l * b");
	}
}

public class B_FunctionOverriding {

	public static void main(String[] args) {
		// ref of base class = object of drived class
		Shape shape = null;

		Scanner scanner = new Scanner(System.in);

		System.out.println("1. for circle 2. for Square 3. for Tri");
		int choice = scanner.nextInt();

		if (choice == 1) {
			shape = new Circle();
		} else if (choice == 2) {
			shape = new Square();
		} else if (choice == 3) {
			shape = new Triangle();
		}
		
		if(shape!=null) {
			shape.printArea();
		}else {
			System.out.println("invalid input");
		}
		
		
		
		
		
		

		// revse is not true

		// Circle c= new Shape();
	}
}
