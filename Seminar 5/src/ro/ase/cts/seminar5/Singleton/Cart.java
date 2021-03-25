package ro.ase.cts.seminar5.Singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ro.ase.cts.seminar5.Factory.Product;

public class Cart implements Serializable{
	private  static Cart instance=null;
	
	private  static Map<String,Cart> instances=null;
	private String type;
	public ArrayList<Product>products;
	
	private Cart() {
		instances=new HashMap<>();
		products=new ArrayList<Product>();
	}
	
	public static synchronized Cart getInstance(String type) {
		if(instances==null){
			instances=new HashMap<>();
			
		}
		if(!instances.containsKey(type)) {
			
			Cart myCart=new Cart();
			myCart.type=type;
			instances.put(type, myCart);
		}
		return instances.get(type);
	}
	
	public ArrayList<Product>getproducts(){
		return products;
	}
	
}
