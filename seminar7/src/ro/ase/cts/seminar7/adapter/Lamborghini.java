package ro.ase.cts.seminar7.adapter;

public class Lamborghini extends EuropeanCar{
	public Lamborghini(String model) {
		super(model);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getMaxSpeed() {
		//in imperial system
		return 200;
	}
}
