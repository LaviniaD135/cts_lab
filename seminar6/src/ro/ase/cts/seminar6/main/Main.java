package ro.ase.cts.seminar6.main;

import ro.ase.cts.seminar6.builder.TechProduct;
import ro.ase.cts.seminar6.builder.TechProductFactory;
import ro.ase.cts.seminar6.singleton.Cart;

import java.util.Scanner;

import ro.ase.cts.seminar6.builder.AbstractProductFactory;
import ro.ase.cts.seminar6.builder.Product;
import ro.ase.cts.seminar6.builder.ProductFactory;

public class Main {

	public static void main(String[] args) {
		Cart myShoppingCart = Cart.getInstance("shopping");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Catalog de produse:\n Produse tech \n Produse office");
		String userPreference = scan.nextLine();
		Product myProduct = null;
		AbstractProductFactory productFactory = null;
		if(userPreference!=null) {
			if(userPreference.equalsIgnoreCase("tech")) {
				productFactory = new TechProductFactory();
			}
		}
		userPreference = scan.nextLine();
		try {
		int selectedId = Integer.valueOf(userPreference);
		myProduct = productFactory.makeProduct(selectedId);

		} catch(NumberFormatException e) {
			System.err.println("Selectie invalida");

		}
		System.out.println(productFactory.getCalaog());
		
//		}else {
//			System.out.println("Optiune invalida");
//			System.out.println("Catalog de produse:\n Produse tech \n  Produse office");
//		}
		
		if(myProduct !=null) {
			myShoppingCart.products.add(myProduct);
		}
		
		for (Product p: myShoppingCart.products) {
			System.out.println(p.getDescription());
		}
	}

}
