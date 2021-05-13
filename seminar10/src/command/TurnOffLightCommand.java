package command;

public class TurnOffLightCommand implements CommandInterface{
	private LightBulb lightBulb;
	
	public TurnOffLightCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

	@Override
	public void execute() {
		lightBulb.turnOffLight();
	}
}
