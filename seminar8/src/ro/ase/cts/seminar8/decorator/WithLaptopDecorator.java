package ro.ase.cts.seminar8.decorator;

public class WithLaptopDecorator extends AbstractBackPackDecorator{

	public WithLaptopDecorator(AbstractBackpack basicBackPack) {
		super(basicBackPack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pack() {
		this.basic.pack();
		
	}

}

