import java.util.ArrayList;
import java.util.Iterator;


public class Iterator1 {

	public static void main(String[] args) {
		
		ArrayList B=new ArrayList();
		
		B.add("Puma");
		B.add("Nike");
		B.add("Adidas");
		B.add("One8");
		B.add("Reebok");
		
		Iterator i=B.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(i.next());
	}
}
