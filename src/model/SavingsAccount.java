package model;
 
import Interfaces.InterestBearing;
 
public class SavingsAccount extends Account implements InterestBearing {
 
    public SavingsAccount(int accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }
 
    @Override
    public void addInterest() {
        balance = balance + (balance * 0.05);
    }
}