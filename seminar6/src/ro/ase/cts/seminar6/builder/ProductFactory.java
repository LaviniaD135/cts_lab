package ro.ase.cts.seminar6.builder;

import java.nio.channels.UnsupportedAddressTypeException;

public class ProductFactory {

	public Product  makeProduct(String type,String productName) throws UnsupportedOperationException {

		if(type.equalsIgnoreCase("type")){
			return new TechProduct(productName);
		}
		else if(type.equalsIgnoreCase("office")){
			return new OfficeProduct(productName);
		}
		else{
			throw new UnsupportedOperationException();
		}
	}
	}