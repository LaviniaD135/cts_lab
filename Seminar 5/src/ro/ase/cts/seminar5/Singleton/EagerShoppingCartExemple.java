package ro.ase.cts.seminar5.Singleton;
import ro.ase.cts.seminar5.Singleton.EagerShoppingCartExemple;

public class EagerShoppingCartExemple {
	public static final EagerShoppingCartExemple instance;
	static {
		instance=new EagerShoppingCartExemple();
	}

	
	private EagerShoppingCartExemple() {};
}
