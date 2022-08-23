package a.b;

public class A {

    private int i = 6;
    public int k = 16;
    protected int m = 116;
    int j = 7;

    void print2() {
        System.out.println("it is a default method");
    }

    private void print1() {
        System.out.println("it is a private method");
    }

    public void print3() {
        System.out.println("it is a public method");
    }

    protected void print4() {
        System.out.println("it is a protected method");
    }

    public void foo() {
        System.out.println("i: " + i);
        print1();
    }
}
