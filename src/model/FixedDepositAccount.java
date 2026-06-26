package model;
 
import Interfaces.InterestBearing;
 
public class FixedDepositAccount extends Account implements InterestBearing {
 
    public FixedDepositAccount(int accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }
 
    @Override
    public void addInterest() {
        balance = balance + (balance * 0.07);
    }
}