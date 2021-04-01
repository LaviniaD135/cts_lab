package ro.ase.cts.seminar6.builder;

public class TechProduct implements Product{

	int id;
	String manufacturer;
	String model;
	String displayType;
	float price;
	

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
