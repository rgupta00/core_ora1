package com.day1.session2;

class Account {

    private int id;
    private String name;
    private double balance;

    //static init block
    static{
        System.out.println("it is a static block.. i am called when class is loaded by JVM");
    }
    
    //init block
    {
        System.out.println("some db init");
        System.out.println("some db init2");
    }

    //how to initilized the instance variable while creating the objects?
    public Account() {

        //  this(1,"foo",600);
    }

    //parameterized ctr
    public Account(int id, String name, double balance) {

        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void printAccountDetails() {
        System.out.println("id : " + id);
        System.out.println("name: " + name);
        System.out.println("balance: " + balance);
    }

}

public class A_BasicsOfOO {

    public static void main(String[] args) {
        Account acc = new Account(1, "raj", 6000);

        acc.printAccountDetails();

        Account acc2 = new Account();

        acc2.printAccountDetails();

    }
}
