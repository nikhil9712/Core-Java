import java.util.ArrayList;

public class Shop {

	public static void main(String[] args) {
		
		ArrayList Shop=new ArrayList<>();
		ArrayList veg=new ArrayList<>();
		
		veg.add("Tomato");
		veg.add("Potato");
		veg.add("Brinjal");
		veg.add("Onion");
		
		for (Object o : veg) {
			Shop.add(o);
			//System.out.println(o);
		}
		System.out.println();
        ArrayList fruits=new ArrayList<>();
		
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("grapes");
		
		for (Object o : fruits) {
			//System.out.println(o);
			Shop.add(o);
		}
		System.out.println();
		
		 System.out.println(Shop.size()); 
			
			
			for (Object o : Shop) {
				System.out.println(o);
			}
			
		
		
		
	}
}
