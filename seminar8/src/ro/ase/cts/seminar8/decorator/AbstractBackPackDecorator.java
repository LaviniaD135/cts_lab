package ro.ase.cts.seminar8.decorator;

public abstract class AbstractBackPackDecorator extends AbstractBackpack{

	private AbstractBackpack basicBackPack;
	protected BackPack basic;
	public AbstractBackPackDecorator(AbstractBackpack basicBackPack) {
		super();
		this.basicBackPack = basicBackPack;
	}
	
}