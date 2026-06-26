package Interfaces;
 
 
import model.Account;
 
public interface Transferable {
	void transfer(Account toAccount, double amount);	
}
 