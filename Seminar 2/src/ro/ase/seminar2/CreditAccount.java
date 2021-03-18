package ro.ase.seminar2;


import ro.ase.seminar2.exceptii.IllegalTransferException;
import ro.ase.seminar2.exceptii.InsufficientFundsException;
import ro.ase.seminar2.interfete.Depositable;
import ro.ase.seminar2.interfete.Transferable;
import ro.ase.seminar2.interfete.Withdrawable;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable{

	@Override
	public void deposit(double amount) {
		if(amount > 0)
			this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount > 0) {
			this.balance -= amount;
		}
		
	}

	@Override
	public void transfer(double amount, Account destination)
			throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}


}