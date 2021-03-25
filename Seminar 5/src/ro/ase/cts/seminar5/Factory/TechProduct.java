package ro.ase.cts.seminar5.Factory;

public class TechProduct implements Product{


	private  TechProduct() {
		// TODO Auto-generated constructor stub
	}
	
	String productName;
	public TechProduct(String productName)
	{
		super();
		this.productName=productName;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "this is a tech product";
	}
}
