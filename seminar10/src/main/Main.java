package main;

import chain.AbstractLogger;
import chain.LoggerChainFactory;
import chain.Verbosity;
import command.CommandInterface;
import command.DimLightCommand;
import command.IncreaseLighIntensitytCommand;
import command.LightBulb;
import command.RemoteControll;
import command.TurnLightOnCommand;
import command.TurnOffLightCommand;
import strategy.MarketingStrategyInterface;
import strategy.ModulMarketing;
import strategy.RandomMarketingStrategy;

public class Main {
	public static void main(String[] args) {
		ModulMarketing modulMarketing = new ModulMarketing();
		modulMarketing.setCurrentStrategy(new RandomMarketingStrategy());
		double puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: " + puncteBonus);
		
		modulMarketing.setCurrentStrategy(new MarketingStrategyInterface() {
			
			@Override
			public double calculateBonus(double base) {
				return 30 * base;
			}
		});
		
		puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: " + puncteBonus);
		
		modulMarketing.setCurrentStrategy((base) -> {return 20 * base;});
		
		puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: " + puncteBonus);
		
		System.out.println("-----------------------------------------------------");
		AbstractLogger loggerChain = LoggerChainFactory.getChainOfLoggers();
		loggerChain.logMessage(Verbosity.INFO, "This log is FYI");
		loggerChain.logMessage(Verbosity.ERROR, "Something went wrong");
		loggerChain.logMessage(Verbosity.DEBUG, "This is a debug message");
		
		System.out.println("-----------------------------------------------------");
		
		LightBulb bulb = new LightBulb();
		CommandInterface lightOnCommand = new TurnLightOnCommand(bulb);
		CommandInterface lightOffCommand = new TurnOffLightCommand(bulb);
		CommandInterface dimLightCommand = new DimLightCommand(bulb);
		CommandInterface increaseIntensityCommand = new IncreaseLighIntensitytCommand(bulb);

		RemoteControll remote = new RemoteControll(lightOnCommand, lightOffCommand,
				dimLightCommand, increaseIntensityCommand);
		remote.pressLightOnButton();
		remote.pressIncreaseLightButton();
		remote.pressDimButton();
		remote.pressDimButton();
		remote.pressDimButton();


	}
}
