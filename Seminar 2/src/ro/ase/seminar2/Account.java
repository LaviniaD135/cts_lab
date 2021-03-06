package ro.ase.seminar2;

import ro.ase.seminar2.exceptii.IllegalTransferException;
import ro.ase.seminar2.exceptii.InsufficientFundsException;

public abstract class Account {

	//e asbstracta deci nu va putea fi instantiata, va servi drept sablon
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount) throws InsufficientFundsException;
	public abstract void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException;
	public abstract double getBalance();
}
