package ro.ase.cts.seminar5.Singleton;

import java.util.ArrayList;

public enum SingletonEnum {
instance;
public ArrayList<String>products;
public ArrayList<String>getproducts(){
	if(products==null) {
		products=new ArrayList<String>();
	}
	return products;
}

	
}
