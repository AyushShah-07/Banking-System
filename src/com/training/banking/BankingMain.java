package com.training.banking;
 
import model.CurrentAccount;
import model.FixedDepositAccount;
import model.SavingsAccount;
import Service.BankingService;   // Capital S because your folder is Service
 
public class BankingMain {
 
    public static void main(String[] args) {
 
        SavingsAccount sa = new SavingsAccount(101, "Rahul", 10000);
        CurrentAccount ca = new CurrentAccount(102, "Amit", 5000);
        FixedDepositAccount fd = new FixedDepositAccount(103, "Neha", 20000);
 
        BankingService service = new BankingService();
 
        System.out.println("Saving Account");
        service.showAccount(sa);
 
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.addInterest();
 
        System.out.println("\nAfter Transactions");
        service.showAccount(sa);
 
        ca.transfer(sa, 2000);
 
        System.out.println("\nCurrent Account");
        service.showAccount(ca);
 
        System.out.println("\nSaving Account");
        service.showAccount(sa);
 
        fd.addInterest();
 
        System.out.println("\nFixed Deposit Account");
        service.showAccount(fd);
    }
}
 