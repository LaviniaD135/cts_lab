package ro.ase.seminar2.interfete;

import ro.ase.seminar2.exceptii.InsufficientFundsException;

public interface Withdrawable {
	public abstract void withdraw(double amount) throws InsufficientFundsException;

}
