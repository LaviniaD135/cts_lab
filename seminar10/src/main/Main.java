package main;

import strategy.ModulMarketing;
import strategy.RandomMarketingStrategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModulMarketing modulMarketing = new ModulMarketing();
		modulMarketing.setCurrentStrategy(new RandomMarketingStrategy());
		double puncteBonus = modulMarketing.getBonus(100);
		
		System.out.println("Numar puncte bonus: " + puncteBonus);
		
	}
}
