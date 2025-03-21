package ArrayList;

import java.util.ArrayList;

public class Fruit {

	public static void main(String[] args) {
		
		ArrayList fruit =new ArrayList<>();
		fruit.add("Mango");
		fruit.add("Apple");
		fruit.add("Grapes");
		
		ArrayList veg =new ArrayList<>();
		veg.add("Reddish");
		veg.add("Tomato");
		veg.add("Onion");
		
		ArrayList shop=new ArrayList<>();
		shop.addAll(fruit);
		shop.addAll(veg);
		
		shop.remove("Reddish");
		
		System.out.println(shop);
		System.out.println("*******");
		
		
	}
}
