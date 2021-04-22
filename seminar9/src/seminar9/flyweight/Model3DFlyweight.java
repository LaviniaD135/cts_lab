package seminar9.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Model3DFlyweight implements ModelFlyweightInterface {
	String nume;
	ArrayList<Double> modelPoints=new ArrayList<>();
	@Override
	public void display(ScreenData data) {
		System.out.println(String.format("%s at coordinates(%f,%f,%f) with color", this.nume,data.getX(),data.getY(),data.getZ(),data.getColor()));
		
	}
	public Model3DFlyweight(String nume, ArrayList<Double> modelPoints) {
		super();
		this.nume = nume;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.modelPoints = new ArrayList<>(new Random().nextInt(1000));
	}

}
