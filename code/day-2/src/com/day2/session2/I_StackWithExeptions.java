package com.day2.session2;
class StackOverFlowExcpetion extends RuntimeException{

	public StackOverFlowExcpetion(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class StackUnderFlowExcpetion extends RuntimeException{

	public StackUnderFlowExcpetion(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class Stack {
	private int top;
	private final int SIZE = 5;
	private int arr[];

	public Stack() {
		arr = new int[SIZE];
		top = -1;
	}

	public void push(int data) {
		if (top == SIZE - 1) {
			throw new StackOverFlowExcpetion("stack is full");
		} else {
			arr[++top] = data;
		}
	}

	public int pop() {
		if (top == -1) {
			throw new StackUnderFlowExcpetion("stack is empty");
		} else {
			return arr[top--];
		}
	}
}

public class I_StackWithExeptions {

	public static void main(String[] args) {
			Stack s=new Stack();
			s.push(44);
			s.push(40);
			s.push(4);
			s.push(124);
			s.push(34);
			//s.push(41);
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			
	}

}
