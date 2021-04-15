package ro.ase.cts.seminar8.main;

import ro.ase.cts.seminar8.composite.CatalogComponent;
import ro.ase.cts.seminar8.composite.Product;
import ro.ase.cts.seminar8.composite.ProductCatalog;
import ro.ase.cts.seminar8.decorator.AbstractBackpack;
import ro.ase.cts.seminar8.decorator.BackPack;
import ro.ase.cts.seminar8.decorator.WithFood;
import ro.ase.cts.seminar8.decorator.WithLaptopDecorator;
import ro.ase.cts.seminar8.facade.OrderFacade;

public class Main {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			OrderFacade facade=new OrderFacade();
			facade.order();
			
			CatalogComponent laptop=new Product("Asus", 1500);
			CatalogComponent smartphone=new Product("Haifon", 10);
			
			CatalogComponent techProductsCatalog=new ProductCatalog("TechProducts");
			
			CatalogComponent officeProductCatalog=new ProductCatalog("OfficeProducts");
			CatalogComponent paperclip=new Product("Paperclip", 10);
			CatalogComponent pen=new Product("Pen", 20);
			
			techProductsCatalog.add(smartphone);
			techProductsCatalog.add(laptop);
			
			officeProductCatalog.add(paperclip);
			officeProductCatalog.add(pen);
			
			CatalogComponent genericProduct=new ProductCatalog("Generic");
			genericProduct.add(new Product("generic product", 1));
			genericProduct.add(techProductsCatalog);
			genericProduct.add(officeProductCatalog);
			System.out.println("\n-----------------------");
			System.out.println(genericProduct.toString());
			System.out.println("\n-----------------------");
			
			
			AbstractBackpack myBackpack=new BackPack();
			myBackpack.pack();
			AbstractBackpack decoratedBackpack=new WithLaptopDecorator(new WithFood(myBackpack,"banana"));
			decoratedBackpack.pack();
		}
		
	}

