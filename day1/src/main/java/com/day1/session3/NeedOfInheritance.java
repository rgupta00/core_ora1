package com.day1.session3;

abstract class Account {
    private int id;
    private String name;
    private double balance;

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


class SavingAccount extends Account{
    
    private double intrestRate;

    public SavingAccount(int id, String name, double balance, double intrestRate) {
        super(id, name, balance);
        this.intrestRate=intrestRate;
    }

    public void printAccountDetails() {
        super.printAccountDetails();  
        System.out.println("intrestRate: " + intrestRate);
    }
}

class CurrentAccount extends Account{
    
    private double overdraft;

    public CurrentAccount(int id, String name, double balance, double overdraft) {
        super(id, name, balance);
        this.overdraft=overdraft;
    }

    public void printAccountDetails() {
        super.printAccountDetails();  
        System.out.println("overdraft: " + overdraft);
    }
}
public class NeedOfInheritance {

    public static void main(String[] args) {
        Account acc = new SavingAccount(1, "raj", 6000,4.5);
        acc.printAccountDetails();
        
        Account acc2 = new SavingAccount(1, "raj", 600000,600000);
        acc2.printAccountDetails();
      

    }
}
