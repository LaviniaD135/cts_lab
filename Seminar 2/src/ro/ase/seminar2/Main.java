package ro.ase.seminar2;
import ro.ase.seminar2.exceptii.IllegalTransferException;
import ro.ase.seminar2.exceptii.InsufficientFundsException;
public class Main {

	public static void main(String[] args) {

		CurrentAccount c = new CurrentAccount(300, "IBAN1");
		c.setNotificationService(new SMSNotificationService());
		CurrentAccount account2 = new CurrentAccount(200, "IBAN2");
		System.out.println("suma disponibila este: " + c.getBalance());
		
		System.out.println("Creditul maxim pt un cont curent este " + CurrentAccount.MAX_CREDIT);
		
		
		SavingsAccount account3 = new SavingsAccount(300, "IBAN3");
		c.deposit(200);
		System.out.println("suma disponibila este: " + c.getBalance());
		
		try {
			c.withdraw(200);
			c.transfer(100, account2);
			c.setNotificationService(new EmailNotificationService());
			c.withdraw(200);
			
			c.setNotificationService(new NotificationService() {
				@Override
				public void sendNotification(String message) {
					System.out.println("sent push notification with message " + message);
				}
			});
		} catch (InsufficientFundsException | IllegalTransferException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println("suma disponibila este: " + c.getBalance());
		
		System.out.println("suma in contul 2 este " + account2.getBalance());

		System.out.println("Suma in contul 3 este " + account3.getBalance());
		((SavingsAccount) account3).addInterest(30);
		System.out.println("Suma in contul 3 este " + account3.getBalance());
		
		account3.deposit(200);
		
		
		Bank banca = new Bank();
		
		BankAccount account4 = banca.openBankAccount(AccountType.CURRENT);
		
	}

}
