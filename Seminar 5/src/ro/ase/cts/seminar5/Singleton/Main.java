package ro.ase.cts.seminar5.Singleton;
import ro.ase.cts.seminar5.Singleton.EagerShoppingCartExemple;


public class Main {
	public static void main(String[] args) {
		
		
		Cart shoppingCart=Cart.getInstance("shoppingCart");
		Cart wishList=Cart.getInstance("wishlist");
		Cart wishList2=Cart.getInstance("wishlist");
		 shoppingCart.getproducts();
		 wishList.getproducts();
		 
		
		 
		 
		 
		 
		 
		 //cum poti implementa singleton si in alta maniera
		 EagerShoppingCartExemple example1=EagerShoppingCartExemple.instance;
		 EagerShoppingCartExemple example2=EagerShoppingCartExemple.instance;
		 
		if(example1==example2) {
			System.out.println("obiectele sunt identice");
		}
		
		SingletonEnum mySingleton=SingletonEnum.instance;
		mySingleton.getproducts();
	}
}
