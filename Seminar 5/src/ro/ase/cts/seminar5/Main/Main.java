package ro.ase.cts.seminar5.Main;

import ro.ase.cts.seminar5.Factory.TechProduct;
import ro.ase.cts.seminar5.Singleton.Cart;

import java.util.Scanner;

import ro.ase.cts.seminar5.Factory.Product;
import ro.ase.cts.seminar5.Factory.ProductFactory;

public class Main {

	public static void main(String[] args) {
		Cart myShoppingCart = Cart.getInstance("shopping");
				

				Scanner scan = new Scanner(System.in);
				System.out.println("Catalog produse :\n tech - Produse tech \n office - Produse office");
				String userPreference=scan.nextLine();
				
				Product myProduct = null;
				

				ProductFactory productFactory = new ProductFactory();
				myProduct = productFactory.makeProduct(userPreference, "generic");
				
				if(myProduct != null) {
					myShoppingCart.products.add(myProduct);
				}
				
				for(Product p:myShoppingCart.products) {
					System.out.println(p.getDescription());
				}
				
				
				
			}
}
