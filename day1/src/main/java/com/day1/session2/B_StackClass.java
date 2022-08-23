package com.day1.session2;
//why not i give them contract so that are force to follow that contract 
//focus on essentail thing not on details

interface Stack {
    public void push(int data);
    public int pop();
}
//me --- > ashok        rajat Stack : pop and push 

class StackRajat implements Stack {

    private int top;
    private final int SIZE = 5;
    private int arr[];

    public StackRajat() {
        arr = new int[SIZE];
        top = -1;
    }

    public void push(int data) {
        if (top == SIZE - 1) {
            System.out.println("stack overflow");
        } else {
            arr[++top] = data;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return -999;
        } else {
            return arr[top--];
        }
    }
}

class StackAshok implements Stack {

    private int top;
    private final int SIZE = 5;
    private int arr[];

    public StackAshok() {
        arr = new int[SIZE];
        top = -1;
    }

    public void push(int data) {
        if (top == SIZE - 1) {
            System.out.println("stack overflow");
        } else {
            arr[++top] = data;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return -999;
        } else {
            return arr[top--];
        }
    }
}

public class B_StackClass {

    public static void main(String[] args) {

        Stack stack = new StackRajat();
//
        stack.push(44);
        stack.push(4);
        stack.push(404);
        stack.push(124);
        stack.push(84);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

//        StackAshok askokStack = new StackAshok();
//
//        askokStack.rajatPush(44);
//        rajatStack.rajatPush(4);
//        askokStack.rajatPush(404);
//        rajatStack.rajatPush(124);
//        rajatStack.rajatPush(84);
//
//        System.out.println(rajatStack.rajatPop());
//        System.out.println(rajatStack.rajatPop());
//        System.out.println(rajatStack.rajatPop());
//        System.out.println(rajatStack.rajatPop());
//        System.out.println(rajatStack.rajatPop());
//        
//        StackRajat rajatStack = new StackRajat();
//
//        rajatStack.rajatPush(44);
//        rajatStack.rajatPush(4);
//        rajatStack.rajatPush(404);
//        rajatStack.rajatPush(124);
//        rajatStack.rajatPush(84);
//
//        System.out.println(rajatStack.rajatPop());
//        System.out.println(rajatStack.rajatPop());
//        System.out.println(rajatStack.rajatPop());
//        System.out.println(rajatStack.rajatPop());
//        System.out.println(rajatStack.rajatPop());
    }

}
