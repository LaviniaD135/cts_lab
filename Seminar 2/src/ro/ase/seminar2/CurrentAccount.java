package ro.ase.seminar2;

import ro.ase.seminar2.exceptii.IllegalTransferException;
import ro.ase.seminar2.exceptii.InsufficientFundsException;
import ro.ase.seminar2.interfete.Depositable;
import ro.ase.seminar2.interfete.NotificationService;
import ro.ase.seminar2.interfete.Transferable;
import ro.ase.seminar2.interfete.Withdrawable;

public class CurrentAccount extends BankAccount implements Depositable, Withdrawable, Transferable{

	public static double MAX_CREDIT = 5000;
	public NotificationService notificationService;
	
	public CurrentAccount() {
		super();
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
	}

	
	
	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService2) {
		this.notificationService = notificationService2;
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException{
		if(this.balance >= amount) {
			this.balance -= amount;
		}
		else {
			throw new InsufficientFundsException("fonduri insuficiente");
		}
		if(this.notificationService != null) {
			this.notificationService.sendNotification("S-a extras suma " + amount);
		}
	}

	public void transfer(double amount, Depositable destination) throws IllegalTransferException, InsufficientFundsException{

		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("conturile coincid");
		}
		else {
			this.withdraw(amount);
			destination.deposit(amount);
		}
	}

	@Override
	public void transfer(double amount, Account destination)
			throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}

	

}