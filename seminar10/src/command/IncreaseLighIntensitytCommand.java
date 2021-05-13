package command;

public class IncreaseLighIntensitytCommand implements CommandInterface{
private LightBulb bulb;
	
	public IncreaseLighIntensitytCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		bulb.increaseLightIntensity();
	}
}
