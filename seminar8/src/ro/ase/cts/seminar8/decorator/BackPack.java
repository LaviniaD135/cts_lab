package ro.ase.cts.seminar8.decorator;

public class BackPack extends AbstractBackpack{

	protected AbstractBackPackDecorator basic;
	@Override
	public void pack() {

		System.out.println("with socks and charger");
	}

}