package ro.ase.cts.seminar8.decorator;

public class WithFood extends AbstractBackPackDecorator{

	
	String food;
	
	public WithFood(AbstractBackpack basicBackPack) {
		super(basicBackPack);
		// TODO Auto-generated constructor stub
	}

	public WithFood(AbstractBackpack basicBackPack, String food) {
		super(basicBackPack);
		this.food = food;
	}

	@Override
	public void pack() {
		this.basic.pack();
		System.out.println("+ "+getfood());
		
	}

	
	public String getfood() {
		return this.food;
	}
}
