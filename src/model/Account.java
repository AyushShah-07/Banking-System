package model;
 
public class Account {
 
    protected int accountNumber;
    protected String customerName;
    protected double balance;
 
    public Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }
 
    public void deposit(double amount) {
        balance += amount;
    }
 
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
 
    public void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Balance        : " + balance);
    }
}