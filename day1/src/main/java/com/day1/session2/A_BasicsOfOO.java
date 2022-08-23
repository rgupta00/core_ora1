package com.day1.session2;

class Account {

    int id;
    String name;
    double balance;

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
            Account acc=new Account();
            acc.id=4;
            acc.name="raj";
            acc.balance=5600;
            
            
            acc.printAccountDetails();
            
            acc.id=5555;
    }
}
