package ro.ase.cts.seminar5.Factory;

public class TechProductFactory extends AbstractProductFactory{
	@Override
	public Product makeProduct(String productName) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return new TechProduct(productName);
	}

	@Override
	public String getCalaog() {
		// TODO Auto-generated method stub
		return "generic - Generic tech product";
	}

}
