package model;
 
import Interfaces.Transferable;
 
public class CurrentAccount extends Account implements Transferable {
 
    public CurrentAccount(int accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }
 
    @Override
    public void transfer(Account toAccount, double amount) {
 
        if (balance >= amount) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Transfer Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}