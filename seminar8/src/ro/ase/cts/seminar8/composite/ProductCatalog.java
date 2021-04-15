package ro.ase.cts.seminar8.composite;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent{

	
	private ArrayList<CatalogComponent> products;
	private String name;
	
	public ProductCatalog(String name) {
		super();
		products=new ArrayList<CatalogComponent>();
		this.name = name;
	}

	@Override
	public void add(CatalogComponent component) {
		// TODO Auto-generated method stub
		this.products.add(component);
		
	}

	@Override
	public void remove(CatalogComponent component) {
		// TODO Auto-generated method stub
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).equals(component.getName()))
			{
				products.remove(i);
			}
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double GetPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}