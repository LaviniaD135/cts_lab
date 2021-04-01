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
				System.out.println("Selectati categoria de produse :\n tech - Produse tech \n office - Produse office");
				String userPreference=scan.nextLine();
				
				Product myProduct = null;
				
				AbstractProductFactory productFactory=null;
			if(userPreference!=null) {
				if(userPreference.equalsIgnoreCase("techs")) {
					productFactory=new TechProductFactory();
				}
			}
				myProduct = productFactory.makeProduct();
				
				if(myProduct != null) {
					myShoppingCart.products.add(myProduct);
				}
				
				for(Product p:myShoppingCart.products) {
					System.out.println(p.getDescription());
				}
				
				
				
			}
}
