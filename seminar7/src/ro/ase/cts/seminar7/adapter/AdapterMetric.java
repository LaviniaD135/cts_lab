package ro.ase.cts.seminar7.adapter;

public class AdapterMetric implements MovableImperial{
	
	private EuropeanCar euroCar;
	private final double multiplier = 1.609344d;
	public AdapterMetric(EuropeanCar euroCar) {
		super();
		this.euroCar = euroCar;
	}

	@Override
	public int getMaxSpeed() {
		return kmToMiles();
	}
	
	private int kmToMiles() {
		return (int) (euroCar.getMaxSpeed() * multiplier);
	}
}
